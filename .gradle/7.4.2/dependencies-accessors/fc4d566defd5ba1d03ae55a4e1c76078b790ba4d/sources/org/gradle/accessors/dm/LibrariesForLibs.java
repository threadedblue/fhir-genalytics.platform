package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libs` extension.
*/
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(providers, config);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers) {
        super(config, providers);
    }

        /**
         * Creates a dependency provider for accumulo (org.apache.accumulo:accumulo-core)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAccumulo() { return create("accumulo"); }

        /**
         * Creates a dependency provider for assertj (org.assertj:assertj-core)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAssertj() { return create("assertj"); }

        /**
         * Creates a dependency provider for context (org.springframework:spring-context)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getContext() { return create("context"); }

        /**
         * Creates a dependency provider for ecoreXcore (org.eclipse.emf:org.eclipse.emf.ecore.xcore.lib)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getEcoreXcore() { return create("ecoreXcore"); }

        /**
         * Creates a dependency provider for emfCommon (org.eclipse.emf:org.eclipse.emf.common)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getEmfCommon() { return create("emfCommon"); }

        /**
         * Creates a dependency provider for emfEcore (org.eclipse.emf:org.eclipse.emf.ecore)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getEmfEcore() { return create("emfEcore"); }

        /**
         * Creates a dependency provider for emfEcoreXMI (org.eclipse.emf:org.eclipse.emf.ecore.xmi)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getEmfEcoreXMI() { return create("emfEcoreXMI"); }

        /**
         * Creates a dependency provider for emfjson (org.eclipse.emfcloud:emfjson-jackson)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getEmfjson() { return create("emfjson"); }

        /**
         * Creates a dependency provider for fhirEmf (org.hl7:fhir.emf)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getFhirEmf() { return create("fhirEmf"); }

        /**
         * Creates a dependency provider for graphulo (edu.mit.ll:graphulo)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getGraphulo() { return create("graphulo"); }

        /**
         * Creates a dependency provider for jacksonAnnotations (com.fasterxml.jackson.core:jackson-annotations)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJacksonAnnotations() { return create("jacksonAnnotations"); }

        /**
         * Creates a dependency provider for jacksonCore (com.fasterxml.jackson.core:jackson-core)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJacksonCore() { return create("jacksonCore"); }

        /**
         * Creates a dependency provider for jacksonDatabind (com.fasterxml.jackson.core:jackson-databind)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJacksonDatabind() { return create("jacksonDatabind"); }

        /**
         * Creates a dependency provider for jsonSchemaValidator (com.networknt:json-schema-validator)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJsonSchemaValidator() { return create("jsonSchemaValidator"); }

        /**
         * Creates a dependency provider for junitJupiterAPI (org.junit.jupiter:junit-jupiter-api)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJunitJupiterAPI() { return create("junitJupiterAPI"); }

        /**
         * Creates a dependency provider for junitJupiterEngine (org.junit.jupiter:junit-jupiter-engine)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJunitJupiterEngine() { return create("junitJupiterEngine"); }

        /**
         * Creates a dependency provider for logbackClassic (ch.qos.logback:logback-classic)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLogbackClassic() { return create("logbackClassic"); }

        /**
         * Creates a dependency provider for mockito (org.mockito:mockito-core)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMockito() { return create("mockito"); }

        /**
         * Creates a dependency provider for slf4jAPI (org.slf4j:slf4j-api)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSlf4jAPI() { return create("slf4jAPI"); }

        /**
         * Creates a dependency provider for springActuator (org.springframework.boot:spring-boot-starter-actuator)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSpringActuator() { return create("springActuator"); }

        /**
         * Creates a dependency provider for springTest (org.springframework.boot:spring-boot-starter-test)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSpringTest() { return create("springTest"); }

        /**
         * Creates a dependency provider for springWeb (org.springframework.boot:spring-boot-starter-web)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSpringWeb() { return create("springWeb"); }

        /**
         * Creates a dependency provider for xtextXbase (org.eclipse.xtext:org.eclipse.xtext.xbase.lib)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getXtextXbase() { return create("xtextXbase"); }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() { return vaccForVersionAccessors; }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() { return baccForBundleAccessors; }

    /**
     * Returns the group of plugins at plugins
     */
    public PluginAccessors getPlugins() { return paccForPluginAccessors; }

    public static class VersionAccessors extends VersionFactory  {

        private final SpringVersionAccessors vaccForSpringVersionAccessors = new SpringVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: acc (2.1.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getAcc() { return getVersion("acc"); }

            /**
             * Returns the version associated to this alias: assertj (3.24.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getAssertj() { return getVersion("assertj"); }

            /**
             * Returns the version associated to this alias: ecore (2.38.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getEcore() { return getVersion("ecore"); }

            /**
             * Returns the version associated to this alias: emf (2.40.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getEmf() { return getVersion("emf"); }

            /**
             * Returns the version associated to this alias: emfjson (2.3.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getEmfjson() { return getVersion("emfjson"); }

            /**
             * Returns the version associated to this alias: fhir (4.3.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getFhir() { return getVersion("fhir"); }

            /**
             * Returns the version associated to this alias: jackson (2.15.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getJackson() { return getVersion("jackson"); }

            /**
             * Returns the version associated to this alias: junit (5.10.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getJunit() { return getVersion("junit"); }

            /**
             * Returns the version associated to this alias: mockito (5.11.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getMockito() { return getVersion("mockito"); }

            /**
             * Returns the version associated to this alias: slf4j (2.0.7)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getSlf4j() { return getVersion("slf4j"); }

            /**
             * Returns the version associated to this alias: springboot (3.2.5)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getSpringboot() { return getVersion("springboot"); }

            /**
             * Returns the version associated to this alias: xbase (2.34.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getXbase() { return getVersion("xbase"); }

            /**
             * Returns the version associated to this alias: xcore (1.7.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getXcore() { return getVersion("xcore"); }

        /**
         * Returns the group of versions at versions.spring
         */
        public SpringVersionAccessors getSpring() { return vaccForSpringVersionAccessors; }

    }

    public static class SpringVersionAccessors extends VersionFactory  {

        public SpringVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: spring.context (6.1.5)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getContext() { return getVersion("spring.context"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

    }

    public static class PluginAccessors extends PluginFactory {

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

    }

}
