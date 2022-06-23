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
package com.influxdb.client.domain;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nonnull;

public class InfluxQLQuery {
    private final String command;
    private final String database;
    private String retentionPolicy;
    private Precision precision;

    public InfluxQLQuery(@Nonnull final String command, @Nonnull final String database) {
        this.command = command;
        this.database = database;
    }

    public String getCommand() {
        return command;
    }

    public String getDatabase() {
        return database;
    }

    public String getRetentionPolicy() {
        return retentionPolicy;
    }

    public InfluxQLQuery setRetentionPolicy(final String retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }

    public Precision getPrecision() {
        return precision;
    }

    public InfluxQLQuery setPrecision(final Precision precision) {
        this.precision = precision;
        return this;
    }


    public enum Precision {
        HOURS("h"),
        MINUTES("m"),
        SECONDS("s"),
        MILLISECONDS("ms"),
        MICROSECONDS("u"),
        NANOSECONDS("n");

        private final String symbol;

        Precision(final String symbol) {
            this.symbol = symbol;
        }

        public String getSymbol() {
            return symbol;
        }

        public static Precision toTimePrecision(final TimeUnit t) {
            switch (t) {
                case HOURS:
                    return HOURS;
                case MINUTES:
                    return MINUTES;
                case SECONDS:
                    return SECONDS;
                case MILLISECONDS:
                    return MILLISECONDS;
                case MICROSECONDS:
                    return MICROSECONDS;
                case NANOSECONDS:
                    return NANOSECONDS;
                default:
                    throw new IllegalArgumentException("time precision must be one of:"
                            + Arrays.toString(Precision.values()));
            }
        }
    }
}
