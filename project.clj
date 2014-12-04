(defproject joost_midje_testing "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :main joost-midje-testing.core
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
  :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.taoensso/timbre "3.3.1"]]
  :profiles {:dev {:dependencies [[midje "1.6.3"]]}})
