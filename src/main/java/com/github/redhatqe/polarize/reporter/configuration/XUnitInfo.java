package com.github.redhatqe.polarize.reporter.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.redhatqe.polarize.reporter.exceptions.InvalidArgument;

import java.util.*;

public class XUnitInfo extends ImporterInfo {
    @JsonProperty
    private Custom custom;
    @JsonProperty
    private Testrun testrun;

    public XUnitInfo() {
        super();
        this.custom = new Custom();
    }

    public XUnitInfo(Custom cus) {
        super();
        this.custom = new Custom();
        Map<String, Boolean> testSuite = new HashMap<>();
        Map<String, String> props = new HashMap<>();
        cus.getTestSuite().forEach(testSuite::put);
        cus.getProperties().forEach(props::put);
        this.custom.setTestSuite(testSuite);
        this.custom.setProperties(props);

        this.testrun = new Testrun();

    }

    public class Custom {
        @JsonProperty(required=true)
        private Map<String, String> properties;
        @JsonProperty("test-suite")
        private Map<String, Boolean> testSuite;

        public Custom() {

        }

        public Map<String, String> getProperties() {
            return properties;
        }

        public void setProperties(Map<String, String> properties) {
            this.properties = properties;
        }

        public Map<String, Boolean> getTestSuite() {
            return testSuite;
        }

        public void setTestSuite(Map<String, Boolean> testSuite) {
            this.testSuite = testSuite;
        }
    }

    public class Testrun {
        @JsonProperty
        private String id;
        @JsonProperty(required=true)
        private String title;
        @JsonProperty(value="template-id", required=true)
        private String templateId;
        @JsonProperty(value="group-id")
        private String groupId;
        @JsonProperty(value="type")
        private String type;

        public Testrun() {

        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTemplateId() {
            return templateId;
        }

        public void setTemplateId(String templateId) {
            this.templateId = templateId;
        }

        public String getGroupId() { return this.groupId; }

        public void setGroupId(String groupId) { this.groupId = groupId; }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            String[] allowed = {"regression", "buildacceptance", "featureacceptance"};
            List<String> check = Arrays.asList(allowed);
            Set<String> allowed_ = new HashSet<>(check);
            if (!allowed_.contains(type))
                throw new InvalidArgument("Testrun type must be one of " + String.join(",", allowed));
            this.type = type;
        }
    }

    public Custom getCustom() {
        return custom;
    }

    public void setCustom(Custom custom) {
        this.custom = custom;
    }

    public Testrun getTestrun() {
        return testrun;
    }

    public void setTestrun(Testrun testrun) {
        this.testrun = testrun;
    }

    public Map<String, String> getProperties() { return this.custom.getProperties(); }

    public void setProperties(Map<String, String> props) { this.custom.setProperties(props); }

    public Map<String, Boolean> getTestSuite() { return this.custom.getTestSuite(); }

    public void setTestSuite(Map<String, Boolean> ts) { this.custom.setTestSuite(ts); }

}
