/*
 * Copyright 2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gradle.api.plugins.catalog;

import org.gradle.api.Action;
import org.gradle.api.Incubating;
import org.gradle.api.initialization.dsl.VersionCatalogBuilder;
import org.gradle.internal.HasInternalProtocol;
import org.gradle.plugin.use.PluginDependenciesSpec;

/**
 * Allows configuring a version catalog.
 *
 * @since 6.8
 */
@Incubating
@HasInternalProtocol
public interface CatalogPluginExtension {
    /**
     * Configures the version catalog.
     * @param spec the spec used to configure the dependencies
     */
    void versionCatalog(Action<? super VersionCatalogBuilder> spec);

    /**
     * Configures the plugins model of this catalog.
     * Currently it's only possible to configure the default versions
     * of plugins.
     *
     * @param spec the spec used to configure the plugins
     */
    void plugins(Action<? super PluginDependenciesSpec> spec);

    /**
     * Configures an explicit alias for a dependency in case of name clash
     */
    void configureExplicitAlias(String alias, String group, String name);
}
