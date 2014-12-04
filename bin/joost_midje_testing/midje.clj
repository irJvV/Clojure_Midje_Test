(ns joost_midje_testing.midje
  (:use [midje.sweet]))

(fact (+ 2 2) => 4)
(fact (+ 2 3) => odd?)

(= #"a.b" #"a.b")

(fact "O wad    some pow'r" => #"wad\s+some")

(fact (+ 2 2) => even?)

(fact [1 3 5 8] => (contains even?))

;;(fact
;;  (account-number ["    _  _     _  _  _  _  _ "
;;                   "  | _| _||_||_ |_   ||_||_|"
;;                   "  ||_  _|  | _||_|  ||_| _|"])
;;  => "123456789")