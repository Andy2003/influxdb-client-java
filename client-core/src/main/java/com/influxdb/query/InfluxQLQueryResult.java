/*
 * The MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.influxdb.query;

import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.influxdb.utils.Arguments;

/**
 * This class represents the result of an influxQL query.
 */
public class InfluxQLQueryResult {

    private List<Result> results;

    /**
     * @return the results
     */
    public List<Result> getResults() {
        return this.results;
    }

    /**
     * @param results the results to set
     */
    public void setResults(final List<Result> results) {
        this.results = results;
    }

    public static class Result {
        private List<Series> series;

        private final int index;

        public Result(final int index) {
            this.index = index;
        }

        public int getIndex() {
            return index;
        }

        /**
         * @return the series
         */
        public List<Series> getSeries() {
            return this.series;
        }

        /**
         * @param series the series to set
         */
        public void setSeries(final List<Series> series) {
            this.series = series;
        }

    }


    public static class Series {
        @Nonnull
        private final Map<String, Integer> columns;

        @Nonnull
        private final String name;

        private List<Record> values;

        public Series(final @Nonnull String name, final @Nonnull Map<String, Integer> columns) {
            this.name = name;
            this.columns = columns;
        }


        /**
         * @return the name
         */
        @Nonnull
        public String getName() {
            return this.name;
        }

        /**
         * @return the columns
         */
        @Nonnull
        public Map<String, Integer> getColumns() {
            return this.columns;
        }


        /**
         * @return the values
         */
        public List<Record> getValues() {
            return this.values;
        }

        /**
         * @param values the values to set
         */
        public void setValues(final List<Record> values) {
            this.values = values;
        }

        @FunctionalInterface
        public interface ValueExtractor {
            Object extractValue(String columnName, String rawValue, int resultIndex, String seriesName);
        }

        public class Record {
            private final Object[] values;

            public Record(final Object[] values) {
                this.values = values;
            }

            /**
             * Get value by key.
             *
             * @param key of value in CSV response
             * @return value
             */
            @Nullable
            public Object getValueByKey(@Nonnull final String key) {

                Arguments.checkNonEmpty(key, "key");

                Integer index = columns.get(key);
                if (index == null) {
                    return null;
                }
                return values[index];
            }

            public Object[] getValues() {
                return values;
            }
        }

    }

}
