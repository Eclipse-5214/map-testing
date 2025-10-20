plugins {
	java
	kotlin("jvm")
	id("dev.deftu.gradle.tools") version("2.57.0")
	id("dev.deftu.gradle.tools.resources") version("2.57.0")
	id("dev.deftu.gradle.tools.bloom") version("2.57.0")
	id("dev.deftu.gradle.tools.shadow") version("2.57.0")
	id("dev.deftu.gradle.tools.minecraft.loom") version("2.57.0")
	id("dev.deftu.gradle.tools.minecraft.releases") version("2.57.0")
}

repositories {
	maven("https://pkgs.dev.azure.com/djtheredstoner/DevAuth/_packaging/public/maven/v1")
}

toolkitLoomHelper {
	useMixinRefMap(modData.id)
}

dependencies {
	modImplementation("net.fabricmc.fabric-api:fabric-api:${mcData.dependencies.fabric.fabricApiVersion}")
	modImplementation("net.fabricmc:fabric-language-kotlin:${mcData.dependencies.fabric.fabricLanguageKotlinVersion}")

	runtimeOnly("me.djtheredstoner:DevAuth-fabric:1.2.1")
}