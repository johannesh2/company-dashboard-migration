/**
 * Sencha GXT 4.0.0 - Sencha for GWT
 * Copyright (c) 2006-2015, Sencha Inc.
 *
 * licensing@sencha.com
 * http://www.sencha.com/products/gxt/license/
 *
 * ================================================================================
 * Open Source License
 * ================================================================================
 * This version of Sencha GXT is licensed under the terms of the Open Source GPL v3
 * license. You may use this license only if you are prepared to distribute and
 * share the source code of your application under the GPL v3 license:
 * http://www.gnu.org/licenses/gpl.html
 *
 * If you are NOT prepared to distribute and share the source code of your
 * application under the GPL v3 license, other commercial and oem licenses
 * are available for an alternate download of Sencha GXT.
 *
 * Please see the Sencha GXT Licensing page at:
 * http://www.sencha.com/products/gxt/license/
 *
 * For clarification or additional options, please contact:
 * licensing@sencha.com
 * ================================================================================
 *
 *
 * ================================================================================
 * Disclaimer
 * ================================================================================
 * THIS SOFTWARE IS DISTRIBUTED "AS-IS" WITHOUT ANY WARRANTIES, CONDITIONS AND
 * REPRESENTATIONS WHETHER EXPRESS OR IMPLIED, INCLUDING WITHOUT LIMITATION THE
 * IMPLIED WARRANTIES AND CONDITIONS OF MERCHANTABILITY, MERCHANTABLE QUALITY,
 * FITNESS FOR A PARTICULAR PURPOSE, DURABILITY, NON-INFRINGEMENT, PERFORMANCE AND
 * THOSE ARISING BY STATUTE OR FROM CUSTOM OR USAGE OF TRADE OR COURSE OF DEALING.
 * ================================================================================
 */
package com.vaadin.example.gxt.companydashboard.client;

import java.math.BigDecimal;

import com.google.gwt.editor.client.Editor.Path;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.PropertyAccess;
import com.vaadin.example.gxt.companydashboard.shared.CompanyDataDTO;

/**
 *
 */
public interface DashboardDataProperties extends PropertyAccess<CompanyDataDTO> {
	@Path("price")
	ValueProvider<CompanyDataDTO, BigDecimal> price();

	@Path("revenuePct")
	ValueProvider<CompanyDataDTO, BigDecimal> revenue();

	@Path("growthPct")
	ValueProvider<CompanyDataDTO, BigDecimal> growth();

	@Path("productPct")
	ValueProvider<CompanyDataDTO, BigDecimal> product();

	@Path("marketPct")
	ValueProvider<CompanyDataDTO, BigDecimal> market();

	ValueProvider<CompanyDataDTO, String> name();

	@Path("id")
	ModelKeyProvider<CompanyDataDTO> nameKey();
}
