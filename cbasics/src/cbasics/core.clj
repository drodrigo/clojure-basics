(ns cbasics.core
  (:gen-class))


; hello clojure
(defn printStuff
  [content]
  (println content))

; basic math OPSerations
(defn sumStuff
  [num1 num2]
  (+ num1 num2)) ; (operator operand1 operand2 .... operandN)

; creating a list
(defn listStuff
  []
  (list 1 2 3))

; get first
(defn getStuff
  []
  (first [1 2 3])) ; last rest

; entry function
(defn -main
  [& args]
  (let [result (getStuff)]
    (println result)))
