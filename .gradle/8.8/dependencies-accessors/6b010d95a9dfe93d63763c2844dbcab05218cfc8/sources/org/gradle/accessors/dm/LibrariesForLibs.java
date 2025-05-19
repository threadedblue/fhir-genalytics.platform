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
 * A catalog of dependencies accessible via the {@code libs} extension.
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
    private final Slf4jLibraryAccessors laccForSlf4jLibraryAccessors = new Slf4jLibraryAccessors(owner);
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
     * Dependency provider for <b>accumulo</b> with <b>org.apache.accumulo:accumulo-core</b> coordinates and
     * with version reference <b>acc</b>
     * <p>
     * This dependency was declared in catalog libraries.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getAccumulo() {
        return create("accumulo");
    }

    /**
     * Dependency provider for <b>assertj</b> with <b>org.assertj:assertj-core</b> coordinates and
     * with version reference <b>assertj</b>
     * <p>
     * This dependency was declared in catalog libraries.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getAssertj() {
        return create("assertj");
    }

    /**
     * Dependency provider for <b>emfjson</b> with <b>org.eclipse.emfcloud:emfjson-jackson</b> coordinates and
     * with version reference <b>emfjson</b>
     * <p>
     * This dependency was declared in catalog libraries.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getEmfjson() {
        return create("emfjson");
    }

    /**
     * Dependency provider for <b>graphulo</b> with <b>edu.mit.ll:graphulo</b> coordinates and
     * with version <b>3.1.2</b>
     * <p>
     * This dependency was declared in catalog libraries.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getGraphulo() {
        return create("graphulo");
    }

    /**
     * Dependency provider for <b>mockito</b> with <b>org.mockito:mockito-core</b> coordinates and
     * with version reference <b>mockito</b>
     * <p>
     * This dependency was declared in catalog libraries.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getMockito() {
        return create("mockito");
    }

    /**
     * Group of libraries at <b>ecore</b>
     */
    public EcoreLibraryAccessors getEcore() {
        return laccForEcoreLibraryAccessors;
    }

    /**
     * Group of libraries at <b>emf</b>
     */
    public EmfLibraryAccessors getEmf() {
        return laccForEmfLibraryAccessors;
    }

    /**
     * Group of libraries at <b>fhir</b>
     */
    public FhirLibraryAccessors getFhir() {
        return laccForFhirLibraryAccessors;
    }

    /**
     * Group of libraries at <b>jackson</b>
     */
    public JacksonLibraryAccessors getJackson() {
        return laccForJacksonLibraryAccessors;
    }

    /**
     * Group of libraries at <b>json</b>
     */
    public JsonLibraryAccessors getJson() {
        return laccForJsonLibraryAccessors;
    }

    /**
     * Group of libraries at <b>junit</b>
     */
    public JunitLibraryAccessors getJunit() {
        return laccForJunitLibraryAccessors;
    }

    /**
     * Group of libraries at <b>logback</b>
     */
    public LogbackLibraryAccessors getLogback() {
        return laccForLogbackLibraryAccessors;
    }

    /**
     * Group of libraries at <b>slf4j</b>
     */
    public Slf4jLibraryAccessors getSlf4j() {
        return laccForSlf4jLibraryAccessors;
    }

    /**
     * Group of libraries at <b>spring</b>
     */
    public SpringLibraryAccessors getSpring() {
        return laccForSpringLibraryAccessors;
    }

    /**
     * Group of libraries at <b>xtext</b>
     */
    public XtextLibraryAccessors getXtext() {
        return laccForXtextLibraryAccessors;
    }

    /**
     * Group of versions at <b>versions</b>
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Group of bundles at <b>bundles</b>
     */
    public BundleAccessors getBundles() {
        return baccForBundleAccessors;
    }

    /**
     * Group of plugins at <b>plugins</b>
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    public static class EcoreLibraryAccessors extends SubDependencyFactory {

        public EcoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>xcore</b> with <b>org.eclipse.emf:org.eclipse.emf.ecore.xcore.lib</b> coordinates and
         * with version reference <b>xcore</b>
         * <p>
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
         * Dependency provider for <b>common</b> with <b>org.eclipse.emf:org.eclipse.emf.common</b> coordinates and
         * with version reference <b>emf</b>
         * <p>
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCommon() {
            return create("emf.common");
        }

        /**
         * Group of libraries at <b>emf.ecore</b>
         */
        public EmfEcoreLibraryAccessors getEcore() {
            return laccForEmfEcoreLibraryAccessors;
        }

    }

    public static class EmfEcoreLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public EmfEcoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>ecore</b> with <b>org.eclipse.emf:org.eclipse.emf.ecore</b> coordinates and
         * with version reference <b>ecore</b>
         * <p>
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> asProvider() {
            return create("emf.ecore");
        }

        /**
         * Dependency provider for <b>xmi</b> with <b>org.eclipse.emf:org.eclipse.emf.ecore.xmi</b> coordinates and
         * with version reference <b>ecore</b>
         * <p>
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getXmi() {
            return create("emf.ecore.xmi");
        }

    }

    public static class FhirLibraryAccessors extends SubDependencyFactory {

        public FhirLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>emf</b> with <b>org.hl7:fhir.emf</b> coordinates and
         * with version reference <b>fhir</b>
         * <p>
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getEmf() {
            return create("fhir.emf");
        }

    }

    public static class JacksonLibraryAccessors extends SubDependencyFactory {

        public JacksonLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>annotations</b> with <b>com.fasterxml.jackson.core:jackson-annotations</b> coordinates and
         * with version reference <b>jackson</b>
         * <p>
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAnnotations() {
            return create("jackson.annotations");
        }

        /**
         * Dependency provider for <b>core</b> with <b>com.fasterxml.jackson.core:jackson-core</b> coordinates and
         * with version reference <b>jackson</b>
         * <p>
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCore() {
            return create("jackson.core");
        }

        /**
         * Dependency provider for <b>databind</b> with <b>com.fasterxml.jackson.core:jackson-databind</b> coordinates and
         * with version reference <b>jackson</b>
         * <p>
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
         * Group of libraries at <b>json.schema</b>
         */
        public JsonSchemaLibraryAccessors getSchema() {
            return laccForJsonSchemaLibraryAccessors;
        }

    }

    public static class JsonSchemaLibraryAccessors extends SubDependencyFactory {

        public JsonSchemaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>validator</b> with <b>com.networknt:json-schema-validator</b> coordinates and
         * with version <b>1.0.42</b>
         * <p>
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
         * Group of libraries at <b>junit.jupiter</b>
         */
        public JunitJupiterLibraryAccessors getJupiter() {
            return laccForJunitJupiterLibraryAccessors;
        }

    }

    public static class JunitJupiterLibraryAccessors extends SubDependencyFactory {

        public JunitJupiterLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>api</b> with <b>org.junit.jupiter:junit-jupiter-api</b> coordinates and
         * with version reference <b>junit</b>
         * <p>
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getApi() {
            return create("junit.jupiter.api");
        }

        /**
         * Dependency provider for <b>engine</b> with <b>org.junit.jupiter:junit-jupiter-engine</b> coordinates and
         * with version reference <b>junit</b>
         * <p>
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getEngine() {
            return create("junit.jupiter.engine");
        }

    }

    public static class LogbackLibraryAccessors extends SubDependencyFactory {

        public LogbackLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>classic</b> with <b>ch.qos.logback:logback-classic</b> coordinates and
         * with version <b>1.4.11</b>
         * <p>
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getClassic() {
            return create("logback.classic");
        }

    }

    public static class Slf4jLibraryAccessors extends SubDependencyFactory {

        public Slf4jLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>api</b> with <b>org.slf4j:slf4j-api</b> coordinates and
         * with version reference <b>slf4j</b>
         * <p>
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getApi() {
            return create("slf4j.api");
        }

    }

    public static class SpringLibraryAccessors extends SubDependencyFactory {

        public SpringLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>actuator</b> with <b>org.springframework.boot:spring-boot-starter-actuator</b> coordinates and
         * with version reference <b>springboot</b>
         * <p>
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getActuator() {
            return create("spring.actuator");
        }

        /**
         * Dependency provider for <b>contextx</b> with <b>org.springframework:spring-context</b> coordinates and
         * with version reference <b>spring.context</b>
         * <p>
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getContextx() {
            return create("spring.contextx");
        }

        /**
         * Dependency provider for <b>test</b> with <b>org.springframework.boot:spring-boot-starter-test</b> coordinates and
         * with version reference <b>springboot</b>
         * <p>
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTest() {
            return create("spring.test");
        }

        /**
         * Dependency provider for <b>web</b> with <b>org.springframework.boot:spring-boot-starter-web</b> coordinates and
         * with version reference <b>springboot</b>
         * <p>
         * This dependency was declared in catalog libraries.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getWeb() {
            return create("spring.web");
        }

    }

    public static class XtextLibraryAccessors extends SubDependencyFactory {

        public XtextLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Dependency provider for <b>xbase</b> with <b>org.eclipse.xtext:org.eclipse.xtext.xbase.lib</b> coordinates and
         * with version reference <b>xbase</b>
         * <p>
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
         * Version alias <b>acc</b> with value <b>2.1.3</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libraries.versions.toml
         */
        public Provider<String> getAcc() { return getVersion("acc"); }

        /**
         * Version alias <b>assertj</b> with value <b>3.24.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libraries.versions.toml
         */
        public Provider<String> getAssertj() { return getVersion("assertj"); }

        /**
         * Version alias <b>ecore</b> with value <b>2.38.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libraries.versions.toml
         */
        public Provider<String> getEcore() { return getVersion("ecore"); }

        /**
         * Version alias <b>emf</b> with value <b>2.40.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libraries.versions.toml
         */
        public Provider<String> getEmf() { return getVersion("emf"); }

        /**
         * Version alias <b>emfjson</b> with value <b>2.3.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libraries.versions.toml
         */
        public Provider<String> getEmfjson() { return getVersion("emfjson"); }

        /**
         * Version alias <b>fhir</b> with value <b>0.0.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libraries.versions.toml
         */
        public Provider<String> getFhir() { return getVersion("fhir"); }

        /**
         * Version alias <b>jackson</b> with value <b>2.15.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libraries.versions.toml
         */
        public Provider<String> getJackson() { return getVersion("jackson"); }

        /**
         * Version alias <b>junit</b> with value <b>5.10.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libraries.versions.toml
         */
        public Provider<String> getJunit() { return getVersion("junit"); }

        /**
         * Version alias <b>mockito</b> with value <b>5.11.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libraries.versions.toml
         */
        public Provider<String> getMockito() { return getVersion("mockito"); }

        /**
         * Version alias <b>slf4j</b> with value <b>2.0.7</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libraries.versions.toml
         */
        public Provider<String> getSlf4j() { return getVersion("slf4j"); }

        /**
         * Version alias <b>springboot</b> with value <b>3.2.5</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libraries.versions.toml
         */
        public Provider<String> getSpringboot() { return getVersion("springboot"); }

        /**
         * Version alias <b>xbase</b> with value <b>2.34.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libraries.versions.toml
         */
        public Provider<String> getXbase() { return getVersion("xbase"); }

        /**
         * Version alias <b>xcore</b> with value <b>2.34.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libraries.versions.toml
         */
        public Provider<String> getXcore() { return getVersion("xcore"); }

        /**
         * Group of versions at <b>versions.spring</b>
         */
        public SpringVersionAccessors getSpring() {
            return vaccForSpringVersionAccessors;
        }

    }

    public static class SpringVersionAccessors extends VersionFactory  {

        public SpringVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>spring.context</b> with value <b>6.1.5</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
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
