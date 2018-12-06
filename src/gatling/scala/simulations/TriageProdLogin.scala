package simulations

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class TriageProdLogin extends Simulation {

  val httpProtocol = http
    .baseURL("https://triage-recommender.auth.eu-west-1.amazoncognito.com")
    .inferHtmlResources()

  val headers_0 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9,mr-IN;q=0.8,mr;q=0.7",
    "cache-control" -> "max-age=0",
    "upgrade-insecure-requests" -> "1",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36")

  val headers_4 = Map(
    "accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9,mr-IN;q=0.8,mr;q=0.7",
    "cache-control" -> "no-cache",
    "pragma" -> "no-cache",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36")

  val headers_5 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9,mr-IN;q=0.8,mr;q=0.7",
    "cache-control" -> "max-age=0",
    "origin" -> "https://triage-recommender.auth.eu-west-1.amazoncognito.com",
    "upgrade-insecure-requests" -> "1",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36")

  val headers_6 = Map("User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36")

  val headers_13 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9,mr-IN;q=0.8,mr;q=0.7",
    "content-type" -> "application/json;charset=UTF-8",
    "id_token" -> "eyJraWQiOiJTUndRK3dGMjNrVDJUU3RwOHR5SXFTUDhxRWtKNFY0Nzc5ZjRmXC9IWEwwaz0iLCJhbGciOiJSUzI1NiJ9.eyJhdF9oYXNoIjoiQ09ub2VMOXlybGVISFdmTXUzOUxkdyIsInN1YiI6ImNlMjJhOWYwLTExZTAtNGJjYS05YmFhLThiZTg4YWYzZWNkNCIsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC5ldS13ZXN0LTEuYW1hem9uYXdzLmNvbVwvZXUtd2VzdC0xX3NkemlzUFpWViIsImN1c3RvbTpqb3VybmFsX3RpdGxlIjoiSm91cm5hbCBvZiBNb2xlY3VsYXIgTGlxdWlkcyIsImNvZ25pdG86dXNlcm5hbWUiOiJjZTIyYTlmMC0xMWUwLTRiY2EtOWJhYS04YmU4OGFmM2VjZDQiLCJhdWQiOiI2ODk5amo3MzM4aGRyOXM2OXV1ZjBlMm01MyIsImV2ZW50X2lkIjoiNmZjMmU3YjEtZjdkYy0xMWU4LWEzNDQtMGY0OTBjMzlkYzZmIiwidG9rZW5fdXNlIjoiaWQiLCJjdXN0b206am91cm5hbCI6Ik1PTExJUSIsImF1dGhfdGltZSI6MTU0MzkzODY3NywiZXhwIjoxNTQzOTQyMjc3LCJpYXQiOjE1NDM5Mzg2NzcsImVtYWlsIjoibW9sbGlxQHRlc3QuY29tIn0.HhjBwlis_9PwN8t52YxTWEwo9-yzTHjTF_R7SMr2dYIeFRGed2Zonj386XhCOgreQjxziSLkF2PbnsiAf8Zlf6aOY-iURsNCYFKC703TLHqyOVJetnYX9_gsQKbXgbAmL79hdtCHYj7ExZQgQuMiwWsmgCiBognq5UnKu8qTa0AiIwelPXTLCBFtogy9LQZPQaG0zIdG-JO9kyAwrT_6ujK6TsYwW98V1eky-CKQ7XLER7EwWvU_1yxwIpWoxKDg_BjBUvLpvW0sckNXvDPMr-XVRdX50UtexhmxTFEuuwmc4xu9xB9074y1nut_n_2Oss2nG6haQJSxCQSbEZAC4g",
    "origin" -> "https://27fvjf3l2j.execute-api.eu-west-1.amazonaws.com",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36")

  val headers_14 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9,mr-IN;q=0.8,mr;q=0.7",
    "id_token" -> "eyJraWQiOiJTUndRK3dGMjNrVDJUU3RwOHR5SXFTUDhxRWtKNFY0Nzc5ZjRmXC9IWEwwaz0iLCJhbGciOiJSUzI1NiJ9.eyJhdF9oYXNoIjoiQ09ub2VMOXlybGVISFdmTXUzOUxkdyIsInN1YiI6ImNlMjJhOWYwLTExZTAtNGJjYS05YmFhLThiZTg4YWYzZWNkNCIsImlzcyI6Imh0dHBzOlwvXC9jb2duaXRvLWlkcC5ldS13ZXN0LTEuYW1hem9uYXdzLmNvbVwvZXUtd2VzdC0xX3NkemlzUFpWViIsImN1c3RvbTpqb3VybmFsX3RpdGxlIjoiSm91cm5hbCBvZiBNb2xlY3VsYXIgTGlxdWlkcyIsImNvZ25pdG86dXNlcm5hbWUiOiJjZTIyYTlmMC0xMWUwLTRiY2EtOWJhYS04YmU4OGFmM2VjZDQiLCJhdWQiOiI2ODk5amo3MzM4aGRyOXM2OXV1ZjBlMm01MyIsImV2ZW50X2lkIjoiNmZjMmU3YjEtZjdkYy0xMWU4LWEzNDQtMGY0OTBjMzlkYzZmIiwidG9rZW5fdXNlIjoiaWQiLCJjdXN0b206am91cm5hbCI6Ik1PTExJUSIsImF1dGhfdGltZSI6MTU0MzkzODY3NywiZXhwIjoxNTQzOTQyMjc3LCJpYXQiOjE1NDM5Mzg2NzcsImVtYWlsIjoibW9sbGlxQHRlc3QuY29tIn0.HhjBwlis_9PwN8t52YxTWEwo9-yzTHjTF_R7SMr2dYIeFRGed2Zonj386XhCOgreQjxziSLkF2PbnsiAf8Zlf6aOY-iURsNCYFKC703TLHqyOVJetnYX9_gsQKbXgbAmL79hdtCHYj7ExZQgQuMiwWsmgCiBognq5UnKu8qTa0AiIwelPXTLCBFtogy9LQZPQaG0zIdG-JO9kyAwrT_6ujK6TsYwW98V1eky-CKQ7XLER7EwWvU_1yxwIpWoxKDg_BjBUvLpvW0sckNXvDPMr-XVRdX50UtexhmxTFEuuwmc4xu9xB9074y1nut_n_2Oss2nG6haQJSxCQSbEZAC4g",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36")

  val headers_15 = Map(
    "accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9,mr-IN;q=0.8,mr;q=0.7",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36")

  val headers_18 = Map(
    "Origin" -> "https://27fvjf3l2j.execute-api.eu-west-1.amazonaws.com",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36")

  val uri1 = "https://d56bk6xwy2chg.cloudfront.net"
  val uri3 = "https://cdnjs.cloudflare.com/ajax/libs"
  val uri4 = "https://27fvjf3l2j.execute-api.eu-west-1.amazonaws.com"
  val uri5 = "https://www.elsevier.com/__data/assets/file/0003/278661/ELS_NS_Logo_2C_RGB.svg"
  val uri6 = "https://d2uqej7bo24sqa.cloudfront.net"

  val scn = scenario("TriageProdLogin")
    .exec(http("request_0")
      .get("/login?client_id=6899jj7338hdr9s69uuf0e2m53&redirect_uri=https://27fvjf3l2j.execute-api.eu-west-1.amazonaws.com/Prod/&response_type=token")
      .headers(headers_0)
      .resources(http("request_1")
        .get(uri6 + "/20180912132350/js/amazon-cognito-advanced-security-data.min.js"),
        http("request_2")
          .get(uri6 + "/eu-west-1_sdzisPZVV/ALL/20181120155943/assets/images/image.jpg"),
        http("request_3")
          .get(uri6 + "/20180912132350/js/jquery-3.2.1.min.js"),
        http("request_4")
          .get("/favicon.ico")
          .headers(headers_4)
          .check(status.is(400))))
    .pause(3)
    .exec(http("request_5")
      .post("/login?client_id=6899jj7338hdr9s69uuf0e2m53&redirect_uri=https://27fvjf3l2j.execute-api.eu-west-1.amazonaws.com/Prod/&response_type=token")
      .headers(headers_5)
      .formParam("_csrf", "4f13ade9-7275-4b0e-a0bb-e525adb7adcb")
      .formParam("username", "molliq@test.com")
      .formParam("password", "Gruffalo#1")
      .formParam("cognitoAsfData", "eyJwYXlsb2FkIjoie1wiY29udGV4dERhdGFcIjp7XCJVc2VyQWdlbnRcIjpcIk1vemlsbGEvNS4wIChXaW5kb3dzIE5UIDEwLjA7IFdpbjY0OyB4NjQpIEFwcGxlV2ViS2l0LzUzNy4zNiAoS0hUTUwsIGxpa2UgR2Vja28pIENocm9tZS83MC4wLjM1MzguMTEwIFNhZmFyaS81MzcuMzZcIixcIkRldmljZUlkXCI6XCJsN2d6d3V0MHo5bWNnNnh2ZGQzajoxNTQzMjQxMzg1NTM2XCIsXCJEZXZpY2VMYW5ndWFnZVwiOlwiZW4tVVNcIixcIkRldmljZUZpbmdlcnByaW50XCI6XCJNb3ppbGxhLzUuMCAoV2luZG93cyBOVCAxMC4wOyBXaW42NDsgeDY0KSBBcHBsZVdlYktpdC81MzcuMzYgKEtIVE1MLCBsaWtlIEdlY2tvKSBDaHJvbWUvNzAuMC4zNTM4LjExMCBTYWZhcmkvNTM3LjM2Q2hyb21lIFBERiBQbHVnaW46Q2hyb21lIFBERiBWaWV3ZXI6TmF0aXZlIENsaWVudDplbi1VU1wiLFwiRGV2aWNlUGxhdGZvcm1cIjpcIldpbjMyXCIsXCJDbGllbnRUaW1lem9uZVwiOlwiMDA6MDBcIn0sXCJ1c2VybmFtZVwiOlwibW9sbGlxQHRlc3QuY29tXCIsXCJ1c2VyUG9vbElkXCI6XCJcIixcInRpbWVzdGFtcFwiOlwiMTU0MzkzODY3NzQwMVwifSIsInNpZ25hdHVyZSI6IjJwQ09RSFMweWx1MEJ4M0xlQmFCQzA5dVQ0VXd3allPQjM2L1hmMTJMdGM9IiwidmVyc2lvbiI6IkpTMjAxNzExMTUifQ==")
      .formParam("signInSubmitButton", "Sign in")
      .resources(http("request_6")
        .get(uri3 + "/dot/1.1.2/doT.min.js")
        .headers(headers_6),
        http("request_7")
          .get(uri3 + "/list.js/1.5.0/list.min.js")
          .headers(headers_6),
        http("request_8")
          .get(uri5 + "")
          .headers(headers_6),
        http("request_9")
          .get(uri1 + "/css/main.css")
          .headers(headers_6),
        http("request_10")
          .get(uri1 + "/js/apiScript.js")
          .headers(headers_6),
        http("request_11")
          .get(uri1 + "/css/landingPage.css")
          .headers(headers_6),
        http("request_12")
          .get(uri1 + "/css/gizmo.css")
          .headers(headers_6),
        http("request_13")
          .post(uri4 + "/Prod/analytics/")
          .headers(headers_13)
          .body(RawFileBody("TriageProdLogin_0013_request.txt")),
        http("request_14")
          .get(uri4 + "/Prod/constants")
          .headers(headers_14),
        http("request_15")
          .get(uri4 + "/favicon.ico")
          .headers(headers_15)
          .check(status.is(403)),
        http("request_16")
          .get(uri4 + "/Prod/journal")
          .headers(headers_14),
        http("request_17")
          .get(uri4 + "/Prod/journal/manuscripts")
          .headers(headers_14),
        http("request_18")
          .get(uri1 + "/gizmo/cache/font/gizmo.woff2")
          .headers(headers_18)))

  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}