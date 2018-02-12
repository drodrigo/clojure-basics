(ns cbasics.core
  (:gen-class))


; hello clojure
(defn printStuff
  [content]
  (println content))

; entry function
(defn -main
  [& args]
  (let [result (printStuff "hello clojure")]
    (println result)))
