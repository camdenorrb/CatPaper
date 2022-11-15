pluginManagement {

	repositories {
		maven("https://maven.12oclock.dev/releases")
		gradlePluginPortal()
		maven("https://papermc.io/repo/repository/maven-public/")
	}

	resolutionStrategy {
		eachPlugin {
			if (requested.id.id == "com.github.johnrengelman.shadowCustom") {
				useModule("com.github.johnrengelman:shadow:${requested.version}")
			}
		}
	}
}

rootProject.name = "CatPaper"

include("catpaper-api", "catpaper-server")
