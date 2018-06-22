/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The data stored in text format.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("TextFormat")
public class TextFormat extends DatasetStorageFormat {
    /**
     * The column delimiter. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "columnDelimiter")
    private Object columnDelimiter;

    /**
     * The row delimiter. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "rowDelimiter")
    private Object rowDelimiter;

    /**
     * The escape character. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "escapeChar")
    private Object escapeChar;

    /**
     * The quote character. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "quoteChar")
    private Object quoteChar;

    /**
     * The null value string. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "nullValue")
    private Object nullValue;

    /**
     * The code page name of the preferred encoding. If miss, the default value
     * is ΓÇ£utf-8ΓÇ¥, unless BOM denotes another Unicode encoding. Refer to
     * the ΓÇ£NameΓÇ¥ column of the table in the following link to set
     * supported values:
     * https://msdn.microsoft.com/library/system.text.encoding.aspx. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "encodingName")
    private Object encodingName;

    /**
     * Treat empty column values in the text file as null. The default value is
     * true. Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "treatEmptyAsNull")
    private Object treatEmptyAsNull;

    /**
     * The number of lines/rows to be skipped when parsing text files. The
     * default value is 0. Type: integer (or Expression with resultType
     * integer).
     */
    @JsonProperty(value = "skipLineCount")
    private Object skipLineCount;

    /**
     * When used as input, treat the first row of data as headers. When used as
     * output,write the headers into the output as the first row of data. The
     * default value is false. Type: boolean (or Expression with resultType
     * boolean).
     */
    @JsonProperty(value = "firstRowAsHeader")
    private Object firstRowAsHeader;

    /**
     * Get the column delimiter. Type: string (or Expression with resultType string).
     *
     * @return the columnDelimiter value
     */
    public Object columnDelimiter() {
        return this.columnDelimiter;
    }

    /**
     * Set the column delimiter. Type: string (or Expression with resultType string).
     *
     * @param columnDelimiter the columnDelimiter value to set
     * @return the TextFormat object itself.
     */
    public TextFormat withColumnDelimiter(Object columnDelimiter) {
        this.columnDelimiter = columnDelimiter;
        return this;
    }

    /**
     * Get the row delimiter. Type: string (or Expression with resultType string).
     *
     * @return the rowDelimiter value
     */
    public Object rowDelimiter() {
        return this.rowDelimiter;
    }

    /**
     * Set the row delimiter. Type: string (or Expression with resultType string).
     *
     * @param rowDelimiter the rowDelimiter value to set
     * @return the TextFormat object itself.
     */
    public TextFormat withRowDelimiter(Object rowDelimiter) {
        this.rowDelimiter = rowDelimiter;
        return this;
    }

    /**
     * Get the escape character. Type: string (or Expression with resultType string).
     *
     * @return the escapeChar value
     */
    public Object escapeChar() {
        return this.escapeChar;
    }

    /**
     * Set the escape character. Type: string (or Expression with resultType string).
     *
     * @param escapeChar the escapeChar value to set
     * @return the TextFormat object itself.
     */
    public TextFormat withEscapeChar(Object escapeChar) {
        this.escapeChar = escapeChar;
        return this;
    }

    /**
     * Get the quote character. Type: string (or Expression with resultType string).
     *
     * @return the quoteChar value
     */
    public Object quoteChar() {
        return this.quoteChar;
    }

    /**
     * Set the quote character. Type: string (or Expression with resultType string).
     *
     * @param quoteChar the quoteChar value to set
     * @return the TextFormat object itself.
     */
    public TextFormat withQuoteChar(Object quoteChar) {
        this.quoteChar = quoteChar;
        return this;
    }

    /**
     * Get the null value string. Type: string (or Expression with resultType string).
     *
     * @return the nullValue value
     */
    public Object nullValue() {
        return this.nullValue;
    }

    /**
     * Set the null value string. Type: string (or Expression with resultType string).
     *
     * @param nullValue the nullValue value to set
     * @return the TextFormat object itself.
     */
    public TextFormat withNullValue(Object nullValue) {
        this.nullValue = nullValue;
        return this;
    }

    /**
     * Get the code page name of the preferred encoding. If miss, the default value is ΓÇ£utf-8ΓÇ¥, unless BOM denotes another Unicode encoding. Refer to the ΓÇ£NameΓÇ¥ column of the table in the following link to set supported values: https://msdn.microsoft.com/library/system.text.encoding.aspx. Type: string (or Expression with resultType string).
     *
     * @return the encodingName value
     */
    public Object encodingName() {
        return this.encodingName;
    }

    /**
     * Set the code page name of the preferred encoding. If miss, the default value is ΓÇ£utf-8ΓÇ¥, unless BOM denotes another Unicode encoding. Refer to the ΓÇ£NameΓÇ¥ column of the table in the following link to set supported values: https://msdn.microsoft.com/library/system.text.encoding.aspx. Type: string (or Expression with resultType string).
     *
     * @param encodingName the encodingName value to set
     * @return the TextFormat object itself.
     */
    public TextFormat withEncodingName(Object encodingName) {
        this.encodingName = encodingName;
        return this;
    }

    /**
     * Get treat empty column values in the text file as null. The default value is true. Type: boolean (or Expression with resultType boolean).
     *
     * @return the treatEmptyAsNull value
     */
    public Object treatEmptyAsNull() {
        return this.treatEmptyAsNull;
    }

    /**
     * Set treat empty column values in the text file as null. The default value is true. Type: boolean (or Expression with resultType boolean).
     *
     * @param treatEmptyAsNull the treatEmptyAsNull value to set
     * @return the TextFormat object itself.
     */
    public TextFormat withTreatEmptyAsNull(Object treatEmptyAsNull) {
        this.treatEmptyAsNull = treatEmptyAsNull;
        return this;
    }

    /**
     * Get the number of lines/rows to be skipped when parsing text files. The default value is 0. Type: integer (or Expression with resultType integer).
     *
     * @return the skipLineCount value
     */
    public Object skipLineCount() {
        return this.skipLineCount;
    }

    /**
     * Set the number of lines/rows to be skipped when parsing text files. The default value is 0. Type: integer (or Expression with resultType integer).
     *
     * @param skipLineCount the skipLineCount value to set
     * @return the TextFormat object itself.
     */
    public TextFormat withSkipLineCount(Object skipLineCount) {
        this.skipLineCount = skipLineCount;
        return this;
    }

    /**
     * Get when used as input, treat the first row of data as headers. When used as output,write the headers into the output as the first row of data. The default value is false. Type: boolean (or Expression with resultType boolean).
     *
     * @return the firstRowAsHeader value
     */
    public Object firstRowAsHeader() {
        return this.firstRowAsHeader;
    }

    /**
     * Set when used as input, treat the first row of data as headers. When used as output,write the headers into the output as the first row of data. The default value is false. Type: boolean (or Expression with resultType boolean).
     *
     * @param firstRowAsHeader the firstRowAsHeader value to set
     * @return the TextFormat object itself.
     */
    public TextFormat withFirstRowAsHeader(Object firstRowAsHeader) {
        this.firstRowAsHeader = firstRowAsHeader;
        return this;
    }

}
