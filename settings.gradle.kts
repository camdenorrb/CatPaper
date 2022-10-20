pluginManagement {
	repositories {
		gradlePluginPortal()
		maven("https://papermc.io/repo/repository/maven-public/")
	}
}

rootProject.name = "CatPaper"

include("catpaper-api", "catpaper-server")
