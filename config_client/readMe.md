Locating Remote Configuration Resources
The Config Service serves property sources from /{application}/{profile}/{label}, where the default bindings in the client app are as follows:

"application" = ${spring.application.name}

"profile" = ${spring.profiles.active} (actually Environment.getActiveProfiles())

"label" = "master"