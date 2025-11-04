package com.eagle0eye.portfolio_api.posts.utils;

import org.apache.commons.text.StringEscapeUtils;

public class XSSValidator {
    public static String sanitize(String input) {
        return input == null ? null : StringEscapeUtils.escapeHtml4(input.trim());
    }
}
