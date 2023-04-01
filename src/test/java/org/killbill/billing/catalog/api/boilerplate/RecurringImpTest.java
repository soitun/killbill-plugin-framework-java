/*
 *  Generated by https://github.com/killbill/api-pojos. Do not edit!
 *
 *  Copyright 2022-2022 The Billing Project, LLC
 *
 *  The Billing Project licenses this file to you under the Apache License,
 *  version 2.0 (the "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at:
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 *  License for the specific language governing permissions and limitations
 *  under the License.
 */

package org.killbill.billing.catalog.api.boilerplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import java.io.IOException;
import org.killbill.billing.catalog.api.Recurring;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test(groups = { "fast" })
public class RecurringImpTest {
    @Test
    public void anInstanceShouldBeEqualToItself()
    {
      RecurringImp a = new RecurringImp.Builder<>().build();
      Assert.assertTrue(a.equals(a));
    }
    @Test
    public void anInstanceShouldBeEqualToItsCopy()
    {
      RecurringImp a = new RecurringImp.Builder<>().build();
      RecurringImp b = new RecurringImp(a);

      Assert.assertTrue(a.equals(b));
    }
    @Test
    public void twoNewInstancesShouldBeEqual()
    {
      RecurringImp a = new RecurringImp.Builder<>().build();
      RecurringImp b = new RecurringImp.Builder<>().build();

      Assert.assertTrue(a.equals( b));
    }
    @Test
    public void twoNewInstancesHashcodeShouldBeEqual()
    {
      RecurringImp a =  new RecurringImp.Builder<>().build();
      RecurringImp b =  new RecurringImp.Builder<>().build();

      Assert.assertTrue(a.hashCode() == b.hashCode());
    }
    @Test
    public void twoNewInstancesStringShouldBeEqual()
    {
      RecurringImp a =  new RecurringImp.Builder<>().build();
      RecurringImp b =  new RecurringImp.Builder<>().build();

      Assert.assertTrue(a.toString().equals(b.toString()));
    }
    @Test
    public void callIssers()
    {
      RecurringImp a =  new RecurringImp.Builder<>().build();

    }
    @Test
    public void callGetters()
    {
      RecurringImp a =  new RecurringImp.Builder<>().build();

      a.getBillingPeriod();
      a.getRecurringPrice();
    }
    @Test
    public void jsonRoundtrip()
      throws IOException,
        JsonParseException,
        JsonProcessingException,
        JsonMappingException
    {
      ObjectMapper mapper = new ObjectMapper();
      mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
      mapper.registerModule(new JodaModule());
      mapper.setDateFormat(new StdDateFormat().withColonInTimeZone(true));
      mapper.findAndRegisterModules();

      RecurringImp a =  new RecurringImp.Builder<>().build();
      String s =  mapper.writeValueAsString(a);;
      Recurring b = mapper.readValue(s, Recurring.class);

      Assert.assertTrue(a.equals( b));
    }
}