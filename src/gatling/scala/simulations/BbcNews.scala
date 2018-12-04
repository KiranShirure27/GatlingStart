package simulations

import io.gatling.core.Predef._
import io.gatling.http.Predef._


import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class BbcNews extends Simulation {

  val httpProtocol = http
    .baseURL("https://push.api.bbci.co.uk")
    .inferHtmlResources()

  val headers_3 = Map("User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36")

  val headers_7 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9,mr-IN;q=0.8,mr;q=0.7",
    "cache-control" -> "max-age=0",
    "if-none-match" -> """W/"440aa-v5C8Zdryky0mYqsF87eXppvmpBg"""",
    "upgrade-insecure-requests" -> "1",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36")

  val headers_34 = Map(
    "accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9,mr-IN;q=0.8,mr;q=0.7",
    "cache-control" -> "no-cache",
    "pragma" -> "no-cache",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36")

  val headers_46 = Map(
    "Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.9,mr-IN;q=0.8,mr;q=0.7",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36")

  val headers_50 = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9,mr-IN;q=0.8,mr;q=0.7",
    "upgrade-insecure-requests" -> "1",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36")

  val headers_63 = Map(
    "Origin" -> "https://www.bbc.co.uk",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36")

  val headers_85 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9,mr-IN;q=0.8,mr;q=0.7",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36")

  val headers_109 = Map(
    "accept" -> "*/*",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-US,en;q=0.9,mr-IN;q=0.8,mr;q=0.7",
    "origin" -> "https://www.bbc.co.uk",
    "user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.110 Safari/537.36")

  val uri01 = "https://ichef.bbci.co.uk"
  val uri02 = "https://ping.chartbeat.net/ping"
  val uri03 = "https://sa.bbc.co.uk/bbc/bbc/s"
  val uri04 = "https://www.bbc.co.uk"
  val uri05 = "https://homepage.files.bbci.co.uk/s/homepage-v5/2687"
  val uri06 = "https://fig.bbc.co.uk/frameworks/fig/2/fig.js"
  val uri07 = "https://logws1363.ati-host.net/hit.xiti"
  val uri08 = "https://m.files.bbci.co.uk/modules"
  val uri09 = "https://static.bbci.co.uk/frameworks"
  val uri10 = "https://mybbc.files.bbci.co.uk"
  val uri11 = "https://mybbc-analytics.files.bbci.co.uk/reverb-client-js"
  val uri12 = "https://static.chartbeat.com/js/chartbeat.js"
  val uri13 = "https://idcta.api.bbc.co.uk/idcta"
  val uri14 = "https://edigitalsurvey.com/l.php"
  val uri15 = "https://nav.files.bbci.co.uk"

  val scn = scenario("bbcNews1")
    .exec(http("request_0")
      .get(uri15 + "/orbit/2.0.0-425.c4e1120/js/require.min.js")
      .resources(http("request_1")
        .get(uri15 + "/orbit-webmodules/0.0.1-166.7295734/cookie-banner/cookie-library.min.js"),
        http("request_2")
          .get(uri15 + "/orbit/2.0.0-425.c4e1120/js/api.min.js"),
        http("request_3")
          .get(uri15 + "/orbit/2.0.0-425.c4e1120/css/orb-ltr.min.css")
          .headers(headers_3),
        http("request_4")
          .get(uri10 + "/s/id/account-idcta/1.9.0/style/id-cta.css")
          .headers(headers_3),
        http("request_5")
          .get(uri15 + "/searchbox/1.0.0-19.f0f6837/css/main.css")
          .headers(headers_3),
        http("request_6")
          .get(uri05 + "/styles/main.css")
          .headers(headers_3),
        http("request_7")
          .get(uri04 + "/")
          .headers(headers_7),
        http("request_8")
          .get(uri01 + "/images/ic/160xn/p0306tt8.png"),
        http("request_9")
          .get(uri01 + "/images/ic/160xn/p0306trm.png"),
        http("request_10")
          .get(uri01 + "/images/ic/160xn/p0306tp8.png"),
        http("request_11")
          .get(uri01 + "/images/ic/160xn/p0306tqc.png"),
        http("request_12")
          .get(uri15 + "/orbit-webmodules/0.0.1-166.7295734/istats/istats-1.js")
          .headers(headers_3),
        http("request_13")
          .get(uri05 + "/fonts/GELIconsFull-Book.woff2"),
        http("request_14")
          .get(uri05 + "/fonts/GillSansW01Light.woff2"),
        http("request_15")
          .get(uri01 + "/images/ic/384x216/p06t19g7.jpg"),
        http("request_16")
          .get(uri01 + "/images/ic/384x216/p06t1b5r.jpg"),
        http("request_17")
          .get(uri01 + "/images/ic/384x216/p06t1gqm.jpg"),
        http("request_18")
          .get(uri15 + "/searchbox/1.0.0-19.f0f6837/img/gel-icon-search-dark.svg"),
        http("request_19")
          .get(uri15 + "/orbit/2.0.0-425.c4e1120/img/orb-sprite.gif"),
        http("request_20")
          .get(uri10 + "/s/id/account-idcta/1.9.0/svg/icon-sprite.svg"),
        http("request_21")
          .get(uri15 + "/orbit/2.0.0-425.c4e1120/img/blq-orbit-blocks_grey.svg"),
        http("request_22")
          .get(uri15 + "/orbit/2.0.0-425.c4e1120/js/orb.min.js"),
        http("request_23")
          .get(uri05 + "/javascripts/app.js"),
        http("request_24")
          .get(uri06 + "?callback=orb.orb_fig")
          .headers(headers_3),
        http("request_25")
          .get(uri10 + "/s/id/account-idcta/1.9.0/modules/idcta-v2/dist/idcta-1.min.js")
          .headers(headers_3),
        http("request_26")
          .get(uri13 + "/config?callback=&ptrt=https%3A%2F%2Fwww.bbc.co.uk%2F")
          .headers(headers_3),
        http("request_27")
          .get(uri13 + "/translations?callback=")
          .headers(headers_3),
        http("request_28")
          .get(uri05 + "/images/video-cta-black.svg"),
        http("request_29")
          .get(uri05 + "/images/live-withpadding.svg"),
        http("request_30")
          .get(uri05 + "/images/right-arrow--grey.svg"),
        http("request_31")
          .get(uri10 + "/s/id/account-idcta/1.9.0/modules/idcta-v2/statusbar.js")
          .headers(headers_3),
        http("request_32")
          .get(uri05 + "/images/audio-cta-black.svg"),
        http("request_33")
          .get(uri05 + "/images/cog.svg"),
        http("request_34")
          .get(uri04 + "/favicon.ico")
          .headers(headers_34),
        http("request_35")
          .get(uri15 + "/orbit/2.0.0-425.c4e1120/js/edr.min.js")
          .headers(headers_3),
        http("request_36")
          .get(uri10 + "/notification-ui/3.9.5/js/NotificationsMain.js")
          .headers(headers_3),
        http("request_37")
          .get(uri11 + "/reverb-0.1.5.js")
          .headers(headers_3),
        http("request_38")
          .get(uri09 + "/jquery/0.3.0/sharedmodules/jquery-1.9.1.js")
          .headers(headers_3),
        http("request_39")
          .get(uri09 + "/relay/0.2.6/sharedmodules/relay-1.js")
          .headers(headers_3),
        http("request_40")
          .get(uri01 + "/images/ic/480x270/p06t1gqm.jpg"),
        http("request_41")
          .get(uri05 + "/images/iplayer-black.svg"),
        http("request_42")
          .get(uri05 + "/images/arrow-right-putty.svg"),
        http("request_43")
          .get(uri05 + "/images/arrow-left-putty.svg"),
        http("request_44")
          .get(uri05 + "/images/cross_light.svg"),
        http("request_45")
          .get(uri05 + "/images/cross_dark.svg"),
        http("request_46")
          .get(uri03 + "?name=home.page&ml_name=webmodule&ml_version=0.0.1-166.7295734&blq_e=orbit&blq_r=orbit&blq_s=orbit&blq_v=default&language=en&app_type=responsive&location_name=&bbc_mc=ad0ps0pf0&screen_resolution=1366x768&bbc_site=homepage&ns_ti=BBC%20-%20Home&ns_c=UTF-8&ns__t=1543399777881&ns_jspageurl=https%3A%2F%2Fwww.bbc.co.uk%2F&ns_referrer=https%3A%2F%2Fwww.bbc.co.uk%2Fnews")
          .headers(headers_46),
        http("request_47")
          .get(uri03 + "?name=home.page&default_modules=1&ns_type=hidden&action_name=page-load&action_type=load&ml_name=webmodule&ml_version=0.0.1-166.7295734&blq_e=orbit&blq_r=orbit&blq_s=orbit&blq_v=default&language=en&app_type=responsive&location_name=&bbc_mc=ad0ps0pf0&screen_resolution=1366x768&bbc_site=homepage&ns_ti=BBC%20-%20Home&ns_c=UTF-8&ns__t=1543399777881&ns_jspageurl=https%3A%2F%2Fwww.bbc.co.uk%2F&ns_referrer=https%3A%2F%2Fwww.bbc.co.uk%2Fnews")
          .headers(headers_46),
        http("request_48")
          .get(uri11 + "/smarttag.min.js")
          .headers(headers_3),
        http("request_49")
          .get(uri15 + "/searchbox/1.0.0-19.f0f6837/drawer/searchboxDrawer.js")
          .headers(headers_3),
        http("request_50")
          .get(uri14 + "?id=INS-642345567&v=7281&x=1366&y=768&d=24&c=null&ck=1&pr=0.25&p=%2F&ref=https%3A%2F%2Fwww.bbc.co.uk%2Fnews&fu=https%3A%2F%2Fwww.bbc.co.uk%2F&xdm=edr&xdm_o=https%3A%2F%2Fwww.bbc.co.uk&xdm_c=edr0")
          .headers(headers_50),
        http("request_51")
          .get(uri15 + "/searchbox/1.0.0-19.f0f6837/drawer/style/enhanced.css")
          .headers(headers_3),
        http("request_52")
          .get(uri07 + "?s=596068&ts=1543399778161&vtag=5.12.0&ptag=js&r=1366x768x24x24&re=1366x150&hl=10x9x38&lng=en-US&idp=1009382981463&jv=0&p=home.page&s2=7&ref=https://www.bbc.co.uk/news")
          .headers(headers_3),
        http("request_53")
          .get(uri15 + "/orbit-webmodules/0.0.1-166.7295734/cookie-banner//cookie-prompt/bbccookies.min.css"),
        http("request_54")
          .get(uri15 + "/orbit-webmodules/0.0.1-166.7295734/cookie-banner//cookie-prompt/en.min.js?callback=cookiePrompt")
          .headers(headers_3),
        http("request_55")
          .get(uri10 + "/notification-ui/3.9.5/css/main.min.css")
          .headers(headers_3),
        http("request_56")
          .get(uri15 + "/orbit-webmodules/0.0.1-166.7295734/cookie-banner//img/bbccookies/cookie_prompt_sprite.png"),
        http("request_57")
          .get(uri15 + "/orbit-webmodules/0.0.1-166.7295734/cookie-banner//img/bbccookies/cookie_prompt_sprite.png"),
        http("request_58")
          .get(uri10 + "/notification-ui/3.9.5//svg/loader.svg"),
        http("request_59")
          .get(uri10 + "/notification-ui/3.9.5//svg/close_icon.svg"),
        http("request_60")
          .get(uri10 + "/notification-ui/3.9.5//svg/setting.svg"),
        http("request_61")
          .get(uri10 + "/notification-ui/3.9.5//svg/arrow_left_black.svg"),
        http("request_62")
          .get(uri10 + "/notification-ui/3.9.5/svg/bell_grey.svg"),
        http("request_63")
          .get(uri13 + "/init?policy=notification&buttonColour=white&ptrt=https%3A%2F%2Fwww.bbc.co.uk%2F")
          .headers(headers_63),
        http("request_64")
          .get(uri03 + "?name=home.page&ns_type=hidden&action_name=nav-banner-cookies&action_type=view&ml_name=webmodule&ml_version=0.0.1-166.7295734&blq_e=orbit&blq_r=orbit&blq_s=orbit&blq_v=default&language=en&app_type=responsive&location_name=&bbc_mc=ad0ps0pf0&screen_resolution=1366x768&bbc_site=homepage&ns_ti=BBC%20-%20Home&ns_c=UTF-8&ns__t=1543399778484&ns_jspageurl=https%3A%2F%2Fwww.bbc.co.uk%2F&ns_referrer=https%3A%2F%2Fwww.bbc.co.uk%2Fnews")
          .headers(headers_46),
        http("request_65")
          .get(uri03 + "?name=home.page&hp_dupe_detected=1&hp_dedupe_occurred=1&hp_module_name=news%20headlines&link_location=top-stories-module&hp_module_template=4&hp_sgm_variant=0&hp_sgm_id=&hp_sgm_user_score=&hp_sgm_user_met_criteria=0&ns_type=hidden&action_name=module_deduped&action_type=remove&ml_name=webmodule&ml_version=0.0.1-166.7295734&blq_e=orbit&blq_r=orbit&blq_s=orbit&blq_v=default&language=en&app_type=responsive&location_name=&bbc_mc=ad0ps0pf0&screen_resolution=1366x768&bbc_site=homepage&ns_ti=BBC%20-%20Home&ns_c=UTF-8&ns__t=1543399778588&ns_jspageurl=https%3A%2F%2Fwww.bbc.co.uk%2F&ns_referrer=https%3A%2F%2Fwww.bbc.co.uk%2Fnews")
          .headers(headers_46),
        http("request_66")
          .get(uri03 + "?name=home.page&hp_dupe_detected=1&hp_dedupe_occurred=1&hp_module_name=sport%20headlines&link_location=top-stories-module&hp_module_template=4&hp_sgm_variant=0&hp_sgm_id=bf50b9eea2&hp_sgm_user_score=&hp_sgm_user_met_criteria=0&ns_type=hidden&action_name=module_deduped&action_type=remove&ml_name=webmodule&ml_version=0.0.1-166.7295734&blq_e=orbit&blq_r=orbit&blq_s=orbit&blq_v=default&language=en&app_type=responsive&location_name=&bbc_mc=ad0ps0pf0&screen_resolution=1366x768&bbc_site=homepage&ns_ti=BBC%20-%20Home&ns_c=UTF-8&ns__t=1543399778588&ns_jspageurl=https%3A%2F%2Fwww.bbc.co.uk%2F&ns_referrer=https%3A%2F%2Fwww.bbc.co.uk%2Fnews")
          .headers(headers_46)))
    .pause(2)
    .exec(http("request_67")
      .get(uri04 + "/sport")
      .headers(headers_50)
      .resources(http("request_68")
        .get(uri01 + "/onesport/cps/800/cpsprodpb/AB7E/production/_104520934_guardiola_empics.jpg")
        .headers(headers_3),
        http("request_69")
          .get(uri15 + "/orbit/2.0.0-425.c4e1120/font/BBCReithSans_W_Rg.woff2")
          .headers(headers_63),
        http("request_70")
          .get(uri15 + "/orbit/2.0.0-425.c4e1120/font/BBCReithSans_W_Bd.woff2")
          .headers(headers_63),
        http("request_71")
          .get(uri15 + "/orbit-webmodules/0.0.1-166.7295734/cookie-banner/cookie-library.min.js"),
        http("request_72")
          .get(uri15 + "/orbit-webmodules/0.0.1-166.7295734/istats/istats-1.js")
          .headers(headers_3),
        http("request_73")
          .get(uri08 + "/bbc-morph-grandstand/5.1.2/latin/enhanced.css")
          .headers(headers_3),
        http("request_74")
          .get(uri15 + "/searchbox/1.0.0-19.f0f6837/img/gel-icon-search-dark.svg"),
        http("request_75")
          .get(uri15 + "/orbit/2.0.0-425.c4e1120/img/orb-sprite.gif"),
        http("request_76")
          .get(uri10 + "/s/id/account-idcta/1.9.0/svg/icon-sprite.svg"),
        http("request_77")
          .get(uri15 + "/orbit/2.0.0-425.c4e1120/img/blq-orbit-blocks_grey.svg"),
        http("request_78")
          .get(uri10 + "/notification-ui/3.9.5/js/NotificationsMain.js")
          .headers(headers_3),
        http("request_79")
          .get(uri10 + "/s/id/account-idcta/1.9.0/modules/idcta-v2/dist/idcta-1.min.js")
          .headers(headers_3),
        http("request_80")
          .get(uri11 + "/reverb-0.1.5.js")
          .headers(headers_3),
        http("request_81")
          .get(uri15 + "/orbit/2.0.0-425.c4e1120/js/asyncFig.min.js")
          .headers(headers_3),
        http("request_82")
          .get(uri15 + "/searchbox/1.0.0-19.f0f6837/drawer/searchboxDrawer.js")
          .headers(headers_3),
        http("request_83")
          .get(uri13 + "/translations?callback=")
          .headers(headers_3),
        http("request_84")
          .get(uri11 + "/smarttag.min.js")
          .headers(headers_3),
        http("request_85")
          .get(uri13 + "/config?callback=&ptrt=https%3A%2F%2Fwww.bbc.co.uk%2Fsport")
          .headers(headers_85),
        http("request_86")
          .get(uri15 + "/orbit/2.0.0-425.c4e1120/js/edr.min.js")
          .headers(headers_3),
        http("request_87")
          .get(uri15 + "/orbit-webmodules/0.0.1-166.7295734/cookie-banner//cookie-prompt/bbccookies.min.css"),
        http("request_88")
          .get("/public/client.js")
          .headers(headers_3),
        http("request_89")
          .get(uri15 + "/orbit-webmodules/0.0.1-166.7295734/cookie-banner//cookie-prompt/en.min.js?callback=cookiePrompt")
          .headers(headers_3),
        http("request_90")
          .get(uri10 + "/s/id/account-idcta/1.9.0/modules/idcta-v2/statusbar.js")
          .headers(headers_3),
        http("request_91")
          .get(uri07 + "?s=596068&ts=1543399782492&vtag=5.12.0&ptag=js&r=1366x768x24x24&re=1366x150&hl=10x9x42&lng=en-US&idp=1009421595661&jv=0&p=sport.page&s2=7&x7=[index]&ref=https://www.bbc.co.uk/")
          .headers(headers_3),
        http("request_92")
          .get(uri03 + "?name=sport.page&ml_name=webmodule&ml_version=0.0.1-166.7295734&blq_e=orbit&blq_r=orbit&blq_s=orbit&blq_v=default&language=en&is_app=0&bbc_site=sport&app_name=sport&app_type=responsive&page_type=index&bbc_mc=ad0ps0pf0&link_location=blq-nav-main-orbit&intlink_from_url=https%3A%2F%2Fwww.bbc.co.uk%2F&intlink_ts=1543399781080&nav_link=Sport&screen_resolution=1366x768&ns_ti=Home%20-%20BBC%20Sport&ns_c=UTF-8&ns__t=1543399782503&ns_jspageurl=https%3A%2F%2Fwww.bbc.co.uk%2Fsport&ns_referrer=https%3A%2F%2Fwww.bbc.co.uk%2F")
          .headers(headers_46),
        http("request_93")
          .get(uri10 + "/notification-ui/3.9.5/css/main.min.css")
          .headers(headers_3),
        http("request_94")
          .get(uri15 + "/orbit-webmodules/0.0.1-166.7295734/cookie-banner//img/bbccookies/cookie_prompt_sprite.png"),
        http("request_95")
          .get(uri15 + "/orbit-webmodules/0.0.1-166.7295734/cookie-banner//img/bbccookies/cookie_prompt_sprite.png"),
        http("request_96")
          .get(uri12 + "")
          .headers(headers_3),
        http("request_97")
          .get(uri15 + "/searchbox/1.0.0-19.f0f6837/drawer/style/enhanced.css")
          .headers(headers_3),
        http("request_98")
          .get(uri15 + "/orbit-webmodules/0.0.1-166.7295734/cookie-banner//img/bbccookies/cookie_prompt_sprite.png"),
        http("request_99")
          .get(uri15 + "/orbit-webmodules/0.0.1-166.7295734/cookie-banner//img/bbccookies/cookie_prompt_sprite.png"),
        http("request_100")
          .get(uri15 + "/orbit-webmodules/0.0.1-166.7295734/cookie-banner//img/bbccookies/cookie_prompt_sprite.png"),
        http("request_101")
          .get(uri15 + "/orbit-webmodules/0.0.1-166.7295734/cookie-banner//img/bbccookies/cookie_prompt_sprite.png"),
        http("request_102")
          .get(uri03 + "?name=sport.page&ns_type=hidden&action_name=nav-banner-cookies&action_type=view&ml_name=webmodule&ml_version=0.0.1-166.7295734&blq_e=orbit&blq_r=orbit&blq_s=orbit&blq_v=default&language=en&is_app=0&bbc_site=sport&app_name=sport&app_type=responsive&page_type=index&bbc_mc=ad0ps0pf0&screen_resolution=1366x768&ns_ti=Home%20-%20BBC%20Sport&ns_c=UTF-8&ns__t=1543399782695&ns_jspageurl=https%3A%2F%2Fwww.bbc.co.uk%2Fsport&ns_referrer=https%3A%2F%2Fwww.bbc.co.uk%2F")
          .headers(headers_46),
        http("request_103")
          .get(uri10 + "/notification-ui/3.9.5//svg/loader.svg"),
        http("request_104")
          .get(uri10 + "/notification-ui/3.9.5//svg/close_icon.svg"),
        http("request_105")
          .get(uri10 + "/notification-ui/3.9.5//svg/setting.svg"),
        http("request_106")
          .get(uri10 + "/notification-ui/3.9.5//svg/arrow_left_black.svg"),
        http("request_107")
          .get(uri10 + "/notification-ui/3.9.5/svg/bell_grey.svg"),
        http("request_108")
          .get(uri15 + "/orbit-webmodules/0.0.1-166.7295734/cookie-banner//img/bbccookies/cookie_prompt_sprite.png"),
        http("request_109")
          .get(uri13 + "/init?policy=notification&buttonColour=white&ptrt=https%3A%2F%2Fwww.bbc.co.uk%2Fsport")
          .headers(headers_109),
        http("request_110")
          .get(uri02 + "?h=bbc.co.uk&p=bbc.co.uk%2Fsport&u=Dk1VfuRKjGGCjd5R1&d=bbc.co.uk&g=50924&g0=sport&g1=No%20Author&nc=1&c=0&x=0&m=0&y=4344&o=1349&w=150&j=45&R=1&W=0&I=0&E=0&e=0&v=https%3A%2F%2Fwww.bbc.co.uk%2F&b=1490&t=BlwZwIhI3-kDJS1uhCs5gP7BLYJ-1&V=109&i=Home%20-%20BBC%20Sport&tz=0&sn=1&sv=DT4eX0DY4hCRB6AcKgBuRQ4SD16xfO&sr=https%3A%2F%2Fwww.bbc.co.uk%2F&sd=1&im=06672ff0&_")
          .headers(headers_3),
        http("request_111")
          .get(uri01 + "/onesport/cps/240/cpsprodpb/CB7B/production/_104519025_mou_getty.jpg")
          .headers(headers_3),
        http("request_112")
          .get(uri01 + "/onesport/cps/240/cpsprodpb/1BB3/production/_104519070_pep.jpg")
          .headers(headers_3),
        http("request_113")
          .get(uri01 + "/onesport/cps/240/cpsprodpb/74FF/production/_104515992_gettyimages-1065343098.jpg")
          .headers(headers_3),
        http("request_114")
          .get(uri01 + "/onesport/cps/240/cpsprodpb/171EE/production/_104520749_fury_reuters.jpg")
          .headers(headers_3),
        http("request_115")
          .get(uri01 + "/onesport/cps/240/cpsprodpb/53DF/production/_104517412_inpho_01086908.jpg")
          .headers(headers_3),
        http("request_116")
          .get(uri01 + "/onesport/cps/240/cpsprodpb/157D6/production/_104522088_p06t1bzz.jpg")
          .headers(headers_3),
        http("request_117")
          .get(uri01 + "/onesport/cps/240/cpsprodpb/120E/production/_104522640_kickitout.jpg")
          .headers(headers_3),
        http("request_118")
          .get(uri01 + "/onesport/cps/240/cpsprodpb/1241D/production/_104518747_hal_getty.jpg")
          .headers(headers_3),
        http("request_119")
          .get(uri01 + "/onesport/cps/240/cpsprodpb/1520D/production/_104514568_benatia2.jpg")
          .headers(headers_3),
        http("request_120")
          .get(uri01 + "/onesport/cps/240/cpsprodpb/7947/production/_103474013_crouchpodcast.jpg")
          .headers(headers_3),
        http("request_121")
          .get(uri01 + "/onesport/cps/240/cpsprodpb/1DE6/production/_102945670_fdpromo.jpg")
          .headers(headers_3)))
    .pause(3)
    .exec(http("request_122")
      .get("/p?t=morph%3A%2F%2Fdata%2Fbbc-morph-sport-filter-data-provider-priority-order-football-scores%2Fversion%2F2.2.5&c=1&t=morph%3A%2F%2Fdata%2Fbbc-morph-sport-football-scores-filter-priority-order-data%2Ftournament%2Fchampions-league%2Fversion%2F2.1.6&c=1")
      .headers(headers_63))

  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}