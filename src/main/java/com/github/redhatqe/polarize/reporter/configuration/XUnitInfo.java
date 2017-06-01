package com.github.redhatqe.polarize.reporter.configuration;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

public class XUnitInfo extends ImporterInfo {
    @JsonProperty
    private Map<String, Map<String, String>> custom;
    @JsonProperty
    private Testrun testrun;

    public XUnitInfo() {
        super();
        this.custom = new HashMap<>();
    }

    public class Testrun {
        private String id;
        private String title;
        @JsonProperty("template-id")
        private String templateId;

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
    }

    public Map<String, Map<String, String>> getCustom() {
        return custom;
    }

    public void setCustom(Map<String, Map<String, String>> custom) {
        this.custom = custom;
    }

    public Testrun getTestrun() {
        return testrun;
    }

    public void setTestrun(Testrun testrun) {
        this.testrun = testrun;
    }

}
