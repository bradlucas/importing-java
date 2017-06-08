(ns importing-java.core
  (:import [org.apache.commons.lang3 StringEscapeUtils])
  (:gen-class))

(defn unescape [s]
  ;; "FWP\u002F5EFll3U" -> "FWP/5EFll3U"
  (StringEscapeUtils/unescapeJava s))

(defn run [strs]
  (doseq [s strs] 
    (println (unescape s))))

(defn -main [& args]
  (if args
    (run args)
    (println "Usage: java -jar importing-java.jar STR\n\n")))
