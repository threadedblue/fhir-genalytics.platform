package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libs` extension.
 */
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final EcoreLibraryAccessors laccForEcoreLibraryAccessors = new EcoreLibraryAccessors(owner);
    private final EmfLibraryAccessors laccForEmfLibraryAccessors = new EmfLibraryAccessors(owner);
    private final FhirLibraryAccessors laccForFhirLibraryAccessors = new FhirLibraryAccessors(owner);
    private final JacksonLibraryAccessors laccForJacksonLibraryAccessors = new JacksonLibraryAccessors(owner);
    private final JsonLibraryAccessors laccForJsonLibraryAccessors = new JsonLibraryAccessors(owner);
    private final JunitLibraryAccessors laccForJunitLibraryAccessors = new JunitLibraryAccessors(owner);
    private final LogbackLibraryAccessors laccForLogbackLibraryAccessors = new LogbackLibraryAccessors(owner);
    private final SpringLibraryAccessors laccForSpringLibraryAccessors = new SpringLibraryAccessors(owner);
    private final XtextLibraryAccessors laccForXtextLibraryAccessors = new XtextLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

        /**
         * Creates a dependency provider for accumulo (org.apache.accumulo:accumulo-core)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAccumulo() {
            return create("accumulo");
    }

        /**
         * Creates a dependency provider for assertj (org.assertj:assertj-core)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAssertj() {
            return create("assertj");
    }

        /**
         * Creates a dependency provider for context (org.springframework:spring-context)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getContext() {
            return create("context");
    }

        /**
         * Creates a dependency provider for emfjson (org.eclipse.emfcloud:emfjson-jackson)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getEmfjson() {
            return create("emfjson");
    }

        /**
         * Creates a dependency provider for graphulo (edu.mit.ll:graphulo)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getGraphulo() {
            return create("graphulo");
    }

        /**
         * Creates a dependency provider for junitJupiterAPI (org.junit.jupiter:junit-jupiter-api)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJunitJupiterAPI() {
            return create("junitJupiterAPI");
    }

        /**
         * Creates a dependency provider for mockito (org.mockito:mockito-core)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMockito() {
            return create("mockito");
    }

        /**
         * Creates a dependency provider for slf4jAPI (org.slf4j:slf4j-api)
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSlf4jAPI() {
            return create("slf4jAPI");
    }

    /**
     * Returns the group of libraries at ecore
     */
    public EcoreLibraryAccessors getEcore() {
        return laccForEcoreLibraryAccessors;
    }

    /**
     * Returns the group of libraries at emf
     */
    public EmfLibraryAccessors getEmf() {
        return laccForEmfLibraryAccessors;
    }

    /**
     * Returns the group of libraries at fhir
     */
    public FhirLibraryAccessors getFhir() {
        return laccForFhirLibraryAccessors;
    }

    /**
     * Returns the group of libraries at jackson
     */
    public JacksonLibraryAccessors getJackson() {
        return laccForJacksonLibraryAccessors;
    }

    /**
     * Returns the group of libraries at json
     */
    public JsonLibraryAccessors getJson() {
        return laccForJsonLibraryAccessors;
    }

    /**
     * Returns the group of libraries at junit
     */
    public JunitLibraryAccessors getJunit() {
        return laccForJunitLibraryAccessors;
    }

    /**
     * Returns the group of libraries at logback
     */
    public LogbackLibraryAccessors getLogback() {
        return laccForLogbackLibraryAccessors;
    }

    /**
     * Returns the group of libraries at spring
     */
    public SpringLibraryAccessors getSpring() {
        return laccForSpringLibraryAccessors;
    }

    /**
     * Returns the group of libraries at xtext
     */
    public XtextLibraryAccessors getXtext() {
        return laccForXtextLibraryAccessors;
    }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() {
        return baccForBundleAccessors;
    }

    /**
     * Returns the group of plugins at plugins
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    public static class EcoreLibraryAccessors extends SubDependencyFactory {

        public EcoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for xcore (org.eclipse.emf:org.eclipse.emf.ecore.xcore.lib)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getXcore() {
                return create("ecore.xcore");
        }

    }

    public static class EmfLibraryAccessors extends SubDependencyFactory {
        private final EmfEcoreLibraryAccessors laccForEmfEcoreLibraryAccessors = new EmfEcoreLibraryAccessors(owner);

        public EmfLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for common (org.eclipse.emf:org.eclipse.emf.common)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCommon() {
                return create("emf.common");
        }

        /**
         * Returns the group of libraries at emf.ecore
         */
        public EmfEcoreLibraryAccessors getEcore() {
            return laccForEmfEcoreLibraryAccessors;
        }

    }

    public static class EmfEcoreLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public EmfEcoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ecore (org.eclipse.emf:org.eclipse.emf.ecore)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("emf.ecore");
        }

            /**
             * Creates a dependency provider for xmi (org.eclipse.emf:org.eclipse.emf.ecore.xmi)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getXmi() {
                return create("emf.ecore.xmi");
        }

    }

    public static class FhirLibraryAccessors extends SubDependencyFactory {

        public FhirLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for emf (org.hl7:fhir.emf)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getEmf() {
                return create("fhir.emf");
        }

    }

    public static class JacksonLibraryAccessors extends SubDependencyFactory {

        public JacksonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for annotations (com.fasterxml.jackson.core:jackson-annotations)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAnnotations() {
                return create("jackson.annotations");
        }

            /**
             * Creates a dependency provider for core (com.fasterxml.jackson.core:jackson-core)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("jackson.core");
        }

            /**
             * Creates a dependency provider for databind (com.fasterxml.jackson.core:jackson-databind)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDatabind() {
                return create("jackson.databind");
        }

    }

    public static class JsonLibraryAccessors extends SubDependencyFactory {
        private final JsonSchemaLibraryAccessors laccForJsonSchemaLibraryAccessors = new JsonSchemaLibraryAccessors(owner);

        public JsonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at json.schema
         */
        public JsonSchemaLibraryAccessors getSchema() {
            return laccForJsonSchemaLibraryAccessors;
        }

    }

    public static class JsonSchemaLibraryAccessors extends SubDependencyFactory {

        public JsonSchemaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for validator (com.networknt:json-schema-validator)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getValidator() {
                return create("json.schema.validator");
        }

    }

    public static class JunitLibraryAccessors extends SubDependencyFactory {
        private final JunitJupiterLibraryAccessors laccForJunitJupiterLibraryAccessors = new JunitJupiterLibraryAccessors(owner);

        public JunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at junit.jupiter
         */
        public JunitJupiterLibraryAccessors getJupiter() {
            return laccForJunitJupiterLibraryAccessors;
        }

    }

    public static class JunitJupiterLibraryAccessors extends SubDependencyFactory {

        public JunitJupiterLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for engine (org.junit.jupiter:junit-jupiter-engine)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getEngine() {
                return create("junit.jupiter.engine");
        }

    }

    public static class LogbackLibraryAccessors extends SubDependencyFactory {

        public LogbackLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for classic (ch.qos.logback:logback-classic)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getClassic() {
                return create("logback.classic");
        }

    }

    public static class SpringLibraryAccessors extends SubDependencyFactory {

        public SpringLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for test (org.springframework.boot:spring-boot-starter-test)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTest() {
                return create("spring.test");
        }

            /**
             * Creates a dependency provider for web (org.springframework.boot:spring-boot-starter-web)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getWeb() {
                return create("spring.web");
        }

    }

    public static class XtextLibraryAccessors extends SubDependencyFactory {

        public XtextLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for xbase (org.eclipse.xtext:org.eclipse.xtext.xbase.lib)
             * This dependency was declared in catalog libraries.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getXbase() {
                return create("xtext.xbase");
        }

    }

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
             * Returns the version associated to this alias: fhir (0.0.1)
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
             * Returns the version associated to this alias: xcore (2.34.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libraries.versions.toml
             */
            public Provider<String> getXcore() { return getVersion("xcore"); }

        /**
         * Returns the group of versions at versions.spring
         */
        public SpringVersionAccessors getSpring() {
            return vaccForSpringVersionAccessors;
        }

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

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

    }

    public static class PluginAccessors extends PluginFactory {

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

    }

}
