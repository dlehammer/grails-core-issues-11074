package plugin_integration_test

import grails.testing.mixin.integration.Integration
import spock.lang.Specification

@Integration
class MyIntegrationServiceSpec extends Specification {

    MyIntegrationService myIntegrationService

    def setup() {
    }

    def cleanup() {
    }

    void "test serviceMethod"() {
        when:
            def result = myIntegrationService.serviceMethod()

        then:
            result
    }
}
