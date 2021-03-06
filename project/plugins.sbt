addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.7.3")

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.0.0")

resolvers += Resolver.url("sbt-plugin-releases",
  new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns)

resolvers += "sbt-idea-repo" at "http://mpeltonen.github.com/maven/"

resolvers += "maven-local" at "file://"+Path.userHome+"/.m2/repository"
