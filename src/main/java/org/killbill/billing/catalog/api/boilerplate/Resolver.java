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

package org.killbill.billing.catalog.api.boilerplate;

import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;
import org.killbill.billing.catalog.api.Block;
import org.killbill.billing.catalog.api.BlockPriceOverride;
import org.killbill.billing.catalog.api.CatalogEntity;
import org.killbill.billing.catalog.api.CatalogUserApi;
import org.killbill.billing.catalog.api.Duration;
import org.killbill.billing.catalog.api.Fixed;
import org.killbill.billing.catalog.api.InternationalPrice;
import org.killbill.billing.catalog.api.Limit;
import org.killbill.billing.catalog.api.Listing;
import org.killbill.billing.catalog.api.MigrationPlan;
import org.killbill.billing.catalog.api.MutableStaticCatalog;
import org.killbill.billing.catalog.api.Plan;
import org.killbill.billing.catalog.api.PlanPhase;
import org.killbill.billing.catalog.api.PlanPhasePriceOverride;
import org.killbill.billing.catalog.api.PlanPhasePriceOverridesWithCallContext;
import org.killbill.billing.catalog.api.Price;
import org.killbill.billing.catalog.api.PriceList;
import org.killbill.billing.catalog.api.PriceListSet;
import org.killbill.billing.catalog.api.Product;
import org.killbill.billing.catalog.api.Recurring;
import org.killbill.billing.catalog.api.SimplePlanDescriptor;
import org.killbill.billing.catalog.api.StaticCatalog;
import org.killbill.billing.catalog.api.Tier;
import org.killbill.billing.catalog.api.TierPriceOverride;
import org.killbill.billing.catalog.api.TieredBlock;
import org.killbill.billing.catalog.api.TieredBlockPriceOverride;
import org.killbill.billing.catalog.api.Unit;
import org.killbill.billing.catalog.api.Usage;
import org.killbill.billing.catalog.api.UsagePriceOverride;
import org.killbill.billing.catalog.api.VersionedCatalog;

public class Resolver extends SimpleAbstractTypeResolver {
    public Resolver(){
        this.addMapping(Block.class, BlockImp.class);
        this.addMapping(BlockPriceOverride.class, BlockPriceOverrideImp.class);
        this.addMapping(CatalogEntity.class, CatalogEntityImp.class);
        this.addMapping(CatalogUserApi.class, CatalogUserApiImp.class);
        this.addMapping(Duration.class, DurationImp.class);
        this.addMapping(Fixed.class, FixedImp.class);
        this.addMapping(InternationalPrice.class, InternationalPriceImp.class);
        this.addMapping(Limit.class, LimitImp.class);
        this.addMapping(Listing.class, ListingImp.class);
        this.addMapping(MigrationPlan.class, MigrationPlanImp.class);
        this.addMapping(MutableStaticCatalog.class, MutableStaticCatalogImp.class);
        this.addMapping(Plan.class, PlanImp.class);
        this.addMapping(PlanPhase.class, PlanPhaseImp.class);
        this.addMapping(PlanPhasePriceOverride.class, PlanPhasePriceOverrideImp.class);
        this.addMapping(PlanPhasePriceOverridesWithCallContext.class, PlanPhasePriceOverridesWithCallContextImp.class);
        this.addMapping(Price.class, PriceImp.class);
        this.addMapping(PriceList.class, PriceListImp.class);
        this.addMapping(PriceListSet.class, PriceListSetImp.class);
        this.addMapping(Product.class, ProductImp.class);
        this.addMapping(Recurring.class, RecurringImp.class);
        this.addMapping(SimplePlanDescriptor.class, SimplePlanDescriptorImp.class);
        this.addMapping(StaticCatalog.class, StaticCatalogImp.class);
        this.addMapping(Tier.class, TierImp.class);
        this.addMapping(TierPriceOverride.class, TierPriceOverrideImp.class);
        this.addMapping(TieredBlock.class, TieredBlockImp.class);
        this.addMapping(TieredBlockPriceOverride.class, TieredBlockPriceOverrideImp.class);
        this.addMapping(Unit.class, UnitImp.class);
        this.addMapping(Usage.class, UsageImp.class);
        this.addMapping(UsagePriceOverride.class, UsagePriceOverrideImp.class);
        this.addMapping(VersionedCatalog.class, VersionedCatalogImp.class);
    }
}
