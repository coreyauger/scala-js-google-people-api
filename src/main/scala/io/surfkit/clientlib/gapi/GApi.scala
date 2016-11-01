package io.surfkit.clientlib.gapi

import io.surfkit.clientlib.gapi.gapi.client.HttpRequest

import scala.scalajs.js
import js.annotation._

@js.native
trait GoogleApiOAuth2TokenObject extends js.Object {
  var access_token: String = js.native
  var error: js.UndefOr[String] = js.native
  var expires_in: String = js.native
  var state: String = js.native
}

@js.native
trait AuthParams extends js.Object {
  var client_id: String = js.native
  var scope: js.Array[String] = js.native
  var immediate: js.UndefOr[Boolean] = js.native
  // TODO: more ?
}

object AuthParams{
  def apply(
             client_id: js.UndefOr[String] = js.undefined,
             scope: js.UndefOr[js.Array[String]] = js.undefined,
             immediate: js.UndefOr[Boolean] = js.undefined
           ): AuthParams = {
    val result = js.Dynamic.literal()
    client_id.foreach(result.client_id = _)
    scope.foreach(result.scope = _)
    immediate.foreach(result.immediate = _)
    result.asInstanceOf[AuthParams]
  }
}


@JSName("gapi")
@js.native
object gapi extends js.Object {

  import scala.scalajs.js.Promise

  @js.native
  object auth extends js.Object {
    def authorize(params: AuthParams, callback: js.Function1[GoogleApiOAuth2TokenObject, Any]): Unit = js.native
    def init(callback: js.Function0[Any]): Unit = js.native
    def getToken(): GoogleApiOAuth2TokenObject = js.native
    def setToken(token: GoogleApiOAuth2TokenObject): Unit = js.native
    def signIn(params: js.Any): Unit = js.native
    def signOut(): Unit = js.native
  }

  @js.native
  object client extends js.Object {

    @js.native
    class HttpRequest[T] extends js.Object {
      def execute(callback: js.Function2[T, js.Any, Any]): Unit = js.native
      def then(success: js.Function1[js.Any, Unit], failure: js.Function1[js.Any, Unit]): Unit = js.native
    }

    @js.native
    class HttpBatch extends js.Object {
      def add(httpRequest: HttpRequest[js.Any], opt_params: js.Any = ???): Unit = js.native
      def execute(callback: js.Function2[js.Any, String, Any]): Unit = js.native
    }

    @js.native
    class RpcRequest extends js.Object {
      def callback(callback: js.Function2[js.Any, String, Unit]): Unit = js.native
    }

    def load(name: String, version: String): Promise[Unit] = js.native
    def load(name: String, version: String, callback: js.Function0[Any], url: String = ???): Unit = js.native
    def request(args: js.Any): HttpRequest[js.Any] = js.native
    def rpcRequest(method: String, version: String = ???, rpcParams: js.Any = ???): RpcRequest = js.native
    def setApiKey(apiKey: String): Unit = js.native
  }
}


object people{
  case class IncludeField(field: String)
  object IncludeField{
    val addresses = IncludeField("person.addresses")
    val age_range = IncludeField("person.age_range")
    val biographies = IncludeField("person.biographies")
    val birthdays = IncludeField("person.birthdays")
    val bragging_rights = IncludeField("person.bragging_rights")
    val cover_photos = IncludeField("person.cover_photos")
    val email_addresses = IncludeField("person.email_addresses")
    val events = IncludeField("person.events")
    val genders = IncludeField("person.genders")
    val im_clients = IncludeField("person.im_clients")
    val interests = IncludeField("person.interests")
    val locales = IncludeField("person.locales")
    val memberships = IncludeField("person.memberships")
    val metadata = IncludeField("person.metadata")
    val names = IncludeField("person.names")
    val nicknames = IncludeField("person.nicknames")
    val occupations  = IncludeField("person.occupations")
    val organizations  = IncludeField("person.organizations")
    val phone_numbers = IncludeField("person.phone_numbers")
    val photos = IncludeField("person.photos")
    val relations = IncludeField("person.relations")
    val relationship_interests = IncludeField("person.relationship_interests")
    val relationship_statuses = IncludeField("person.relationship_statuses")
    val residences = IncludeField("person.residences")
    val skills = IncludeField("person.skills")
    val taglines = IncludeField("person.taglines")
    val urls = IncludeField("person.urls")
  }
  def connections(pageSize: Int, includeFields: List[IncludeField]): gapi.client.HttpRequest[Int] = {
    
  }
}


