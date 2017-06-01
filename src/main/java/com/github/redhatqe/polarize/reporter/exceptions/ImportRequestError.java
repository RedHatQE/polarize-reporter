package com.github.redhatqe.polarize.reporter.exceptions;

/**
 * Created by stoner on 5/31/17.
 */
public class ImportRequestError extends Error {
    public ImportRequestError(String format) {
        super(format);
    }
}
