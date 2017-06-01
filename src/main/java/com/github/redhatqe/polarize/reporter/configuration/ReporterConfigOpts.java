package com.github.redhatqe.polarize.reporter.configuration;


import com.github.redhatqe.byzantine.config.Opts;

public class ReporterConfigOpts extends Opts {
    public static final String TESTRUN_TITLE = "testrun-title";
    public static final String TESTRUN_ID = "testrun-id";
    public static final String PROJECT = "project";

    public static final String XUNIT_SELECTOR_NAME = "xunit-selector-name";
    public static final String XUNIT_SELECTOR_VAL = "xunit-selector-val";


    public static final String XUNIT_IMPORTER_ENABLED = "xunit-importer-enabled";
    public static final String TR_DRY_RUN = "dry-run";
    public static final String TR_SET_FINISHED = "set-testrun-finished";
    public static final String TR_INCLUDE_SKIPPED = "include-skipped";

    public static final String TC_IMPORTER_TIMEOUT = "testcase-importer-timeout";
    public static final String XUNIT_IMPORTER_TIMEOUT = "xunit-importer-timeout";
    public static final String TR_PROPERTY = "property";
    public static final String NEW_XUNIT = "new-xunit";
    public static final String CURRENT_XUNIT = "current-xunit";
    public static final String EDIT_CONFIG = "edit-config";
    public static final String PROJECT_NAME = "project-name";

    public static final String SERVER = "server";
    public static final String BASE_DIR = "base-dir";
    public static final String MAPPING = "mapping";
    public static final String TC_XML_PATH = "testcases-xml";
    public static final String REQ_XML_PATH = "requirements-xml";
    public static final String USERNAME = "user-name";
    public static final String USERPASSWORD = "user-password";
    public static final String HELP = "help";
}
