package plugin_integration_test

import grails.gorm.transactions.Transactional

@Transactional
class MyIntegrationService {

    def serviceMethod() {
        return true
    }
}
