(ns importing-java.core-test
  (:require [clojure.test :refer :all]
            [importing-java.core :refer :all]))

(deftest unescape-test
  (testing "Testing unescape"
    (is (= "FWP\u002F5EFll3U" "FWP/5EFll3U"))))
