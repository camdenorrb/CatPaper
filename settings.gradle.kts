pluginManagement {
	repositories {
		mavenCentral()
		gradlePluginPortal()
		maven("https://papermc.io/repo/repository/maven-public/")
	}

	resolutionStrategy {
		eachPlugin {
			if (requested.id.id == "com.guardsquare.proguard") {
				useModule("com.guardsquare:proguard-gradle:${requested.version}")
			}
		}
	}
}

rootProject.name = "CatPaper"

include("catpaper-api", "catpaper-server")
