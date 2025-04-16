pluginManagement {
    repositories {
        maven( url = "https://jitpack.io")
        google()
        mavenCentral()
        gradlePluginPortal()

        maven ( url ="https://maven.aliyun.com/repository/google")
        maven ( url ="https://maven.aliyun.com/repository/central")
        maven ( url ="https://maven.aliyun.com/repository/public")
        maven ( url ="https://maven.aliyun.com/repository/jcenter")
        maven ( url ="https://maven.aliyun.com/repository/gradle-plugin" )
        maven {
            // 添加Mob Maven地址
            url = uri("https://mvn.mob.com/android")
        }
        flatDir {
            dirs("libs")
        }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven {
            // 添加Mob Maven地址
            url = uri("https://mvn.mob.com/android")
        }
        maven( url = "https://jitpack.io")
        google()
        mavenCentral()
        maven ( url ="https://maven.aliyun.com/repository/google")
        maven ( url ="https://maven.aliyun.com/repository/central")
        maven ( url ="https://maven.aliyun.com/repository/public")
        maven ( url ="https://maven.aliyun.com/repository/jcenter")
        maven ( url ="https://maven.aliyun.com/repository/gradle-plugin" )

        flatDir {
            dirs("libs")
        }
    }
}

rootProject.name = "ColorPicker"
include(":app")

include(":colorpicker")
//include(":moduler:editor")
