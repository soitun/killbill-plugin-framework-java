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

package org.killbill.billing.catalog.api.rules.boilerplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import java.io.IOException;
import org.killbill.billing.catalog.api.rules.Case;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test(groups = { "fast" })
public class CaseImpTest {
    @Test
    public void anInstanceShouldBeEqualToItself()
    {
      CaseImp a = new CaseImp.Builder<>().build();
      Assert.assertTrue(a.equals(a));
    }
    @Test
    public void anInstanceShouldBeEqualToItsCopy()
    {
      CaseImp a = new CaseImp.Builder<>().build();
      CaseImp b = new CaseImp(a);

      Assert.assertTrue(a.equals(b));
    }
    @Test
    public void twoNewInstancesShouldBeEqual()
    {
      CaseImp a = new CaseImp.Builder<>().build();
      CaseImp b = new CaseImp.Builder<>().build();

      Assert.assertTrue(a.equals( b));
    }
    @Test
    public void twoNewInstancesHashcodeShouldBeEqual()
    {
      CaseImp a =  new CaseImp.Builder<>().build();
      CaseImp b =  new CaseImp.Builder<>().build();

      Assert.assertTrue(a.hashCode() == b.hashCode());
    }
    @Test
    public void twoNewInstancesStringShouldBeEqual()
    {
      CaseImp a =  new CaseImp.Builder<>().build();
      CaseImp b =  new CaseImp.Builder<>().build();

      Assert.assertTrue(a.toString().equals(b.toString()));
    }
    @Test
    public void callIssers()
    {
      CaseImp a =  new CaseImp.Builder<>().build();

    }
    @Test
    public void callGetters()
    {
      CaseImp a =  new CaseImp.Builder<>().build();

      a.getBillingPeriod();
      a.getCatalog();
      a.getPriceList();
      a.getProduct();
      a.getProductCategory();
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

      CaseImp a =  new CaseImp.Builder<>().build();
      String s =  mapper.writeValueAsString(a);;
      Case b = mapper.readValue(s, Case.class);

      Assert.assertTrue(a.equals( b));
    }
}
