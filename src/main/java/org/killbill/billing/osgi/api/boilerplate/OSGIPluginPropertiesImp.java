/* This is generated code, edit with caution! */
/*
 * Copyright 2022-2022 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.killbill.billing.osgi.api.boilerplate;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import org.killbill.billing.osgi.api.OSGIPluginProperties;

@JsonDeserialize( builder = OSGIPluginPropertiesImp.Builder.class )
public class OSGIPluginPropertiesImp implements OSGIPluginProperties, Serializable {

    private static final long serialVersionUID = 0xBA59CD1E61252620L;


    public OSGIPluginPropertiesImp(final OSGIPluginPropertiesImp that) {
    }
    protected OSGIPluginPropertiesImp(final OSGIPluginPropertiesImp.Builder<?> builder) {
    }
    protected OSGIPluginPropertiesImp() { }
    @Override
    public boolean equals(final Object o) {
        if ( this == o ) {
            return true;
        }
        if ( ( o == null ) || ( this.getClass() != o.getClass() ) ) {
            return false;
        }
        final OSGIPluginPropertiesImp that = (OSGIPluginPropertiesImp) o;
        return true;
    }
    @Override
    public int hashCode() {
        int result = 1;
        return result;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(this.getClass().getSimpleName());
        sb.append("{");
        sb.append("}");
        return sb.toString();
    }

    @SuppressWarnings("unchecked")
    public static class Builder<T extends OSGIPluginPropertiesImp.Builder<T>> {


        public Builder() { }
        public Builder(final Builder that) {
        }
        public T source(final OSGIPluginProperties that) {
            return (T) this;
        }
        protected Builder validate() {
          return this;
        }
        public OSGIPluginPropertiesImp build() {
            return new OSGIPluginPropertiesImp(this.validate());
        }
    }
}
