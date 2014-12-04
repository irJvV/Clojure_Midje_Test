(ns joost-midje-testing.core (:require [taoensso.timbre :as timbre]))

(timbre/refer-timbre)
(timbre/set-config! [:appenders :spit :enabled?] true)
(timbre/set-config! [:shared-appender-config :spit-filename] "log_files/joost_midje_testing_log.txt")


(info "This will print")

(spy :info (* 5 4 3 2 1))

;;(info (Exception. "Oh noes") "arg1" "arg2")