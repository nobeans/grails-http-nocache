class HttpNocacheGrailsPlugin {
    // the plugin version
    def version = "0.2"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "2.1 > *"
    // the other plugins this plugin depends on
    def dependsOn = [:]
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/views/error.gsp",
        "grails-app/domain/test/**",
        "grails-app/i18n/**",
        "web-app/**",
        "scripts/**",
    ]
    def author = "Yasuharu Nakano"
    def authorEmail = "ynak@jggug.org"
    def title = "filter for setting no-cache to http response"
    def description = '''\\
This plugin has only one Filter to set no-cache.
It's very simple.
'''
    def documentation = "https://github.com/nobeans/grails-http-nocache"
}
