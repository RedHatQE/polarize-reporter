package com.github.redhatqe.polarize.reporter.configuration;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.redhatqe.byzantine.config.IConfig;
import com.github.redhatqe.byzantine.config.Serializer;
import com.github.redhatqe.byzantine.parser.Setter;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReporterConfig implements IConfig {
    // =========================================================================
    // 1. Add all properties for your class/config
    // =========================================================================
    @JsonProperty
    private String basedir;
    @JsonProperty("testcases-xml")
    private String testcasesXml;
    @JsonProperty
    private String mapping;
    @JsonProperty
    private String author;
    @JsonProperty
    private String project;
    @JsonProperty
    private Map<String, ServerInfo> servers;
    @JsonProperty
    private XUnitInfo xunit;
    @JsonProperty
    private Credentials kerberos;

    // ==========================================================================
    // 2. Add all fields not belonging to the config here
    // ==========================================================================
    @JsonIgnore
    public Map<String, Setter<String>> handlers = new HashMap<>();

    // =========================================================================
    // 3. Constructors go here.  Remember that there must be a no-arg constructor
    // =========================================================================
    public ReporterConfig() {
        this.servers = new HashMap<>();
    }


    //=============================================================================
    // 4. Define the bean setters and getters for all fields in #1
    //=============================================================================
    public String getTestcasesXml() {
        return testcasesXml;
    }

    public void setTestcasesXml(String testcasesXml) {
        this.testcasesXml = testcasesXml;
    }

    public String getMapping() {
        return mapping;
    }

    public void setMapping(String mapping) {
        this.mapping = mapping;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public Map<String, ServerInfo> getServers() {
        return servers;
    }

    public void setServers(Map<String, ServerInfo> servers) {
        this.servers = servers;
    }

    public XUnitInfo getXunit() {
        return xunit;
    }

    public void setXunit(XUnitInfo xunit) {
        this.xunit = xunit;
    }

    public Credentials getKerberos() {
        return kerberos;
    }

    public void setKerberos(Credentials kerberos) {
        this.kerberos = kerberos;
    }

    public String getBasedir() {
        return basedir;
    }

    public void setBasedir(String basedir) {
        this.basedir = basedir;
    }

    //=============================================================================
    // 5. Define any functions for parsing the value of a command line opt and setting the values
    //=============================================================================



    //=============================================================================
    // 6. implement the methods from IConfig
    //=============================================================================
    @Override
    public void setupDefaultHandlers() {

    }

    @Override
    public void addHandler(String name, Setter<String> setter) {

    }

    @Override
    public Setter<String> dispatch(String key) {
        return null;
    }

    public static void main(String[] args) throws IOException {
        ReporterConfig cfg = new ReporterConfig();
        cfg.setAuthor("Sean toner");
        cfg.setMapping("/home/stoner/Projects/mapping.json");

        XUnitInfo xi = new XUnitInfo();
        xi.setEndpoint("/importers/xunit");
        xi.setTimeout(10000);

        Selector sel = new Selector();
        sel.setName("rhsm_qe");
        sel.setValue("xunit_importer");
        xi.setSelector(sel);
        xi.setEnabled(true);

        XUnitInfo.Testrun tr = xi.new Testrun();
        tr.setId("");
        tr.setTitle("");
        xi.setTestrun(tr);

        Map<String, Map<String, String>> cu = xi.getCustom();
        Map<String, String> custom = new HashMap<>();
        Map<String, String> props = new HashMap<>();
        custom.put("include-skipped", "true");
        props.put("planned-in", "RHEL_74_snap1");
        cu.put("test-suite", custom);
        cu.put("properties", props);
        xi.setCustom(cu);

        ServerInfo si = new ServerInfo("http:/belch", "stoner", "foo");
        ServerInfo broker = new ServerInfo("http://psychedilic/man", "whoops", "shazam");
        Map<String, ServerInfo> servers = cfg.getServers();
        servers.put("polarion-devel", si);
        servers.put("broker", broker);

        cfg.setXunit(xi);
        cfg.setServers(servers);

        Serializer.toYaml(cfg, "/tmp/reporter.yaml");

        System.out.println("Done serializing to yaml");

        File cfgFile = new File("/tmp/polarize-reporter-config.yml");
        ReporterConfig rcfg = Serializer.fromYaml(ReporterConfig.class, cfgFile);
        System.out.println("Done marshalling to POJO");
    }
}
