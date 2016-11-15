# scala-js-google-people-api
Type safe and scala friendly wrapper around google people api

# example usage
```scala
  val CLIENT_ID = "YOU_CLIENT_ID"
      val scopes = scalajs.js.Array("https://www.googleapis.com/auth/contacts.readonly")
      gapi.auth.authorize(AuthParams(CLIENT_ID, scopes), { authResult: GoogleApiOAuth2TokenObject =>

        if (authResult.error.isDefined) println(s"error: ${authResult.error}")
        else {
          gapi.client.load("https://people.googleapis.com/$discovery/rest", "v1").toFuture.foreach { _ =>
            val primaryListFuture = people.connections(500).map { connections: people.Connections =>
              people.get(connections.connections).flatMap { person =>
                val name = people.get(person.names).headOption.map(_.displayName.getOrElse("")).getOrElse("")
                // ect..
              }
            }
          }
        }
```
                
