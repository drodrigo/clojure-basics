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

; entry function
(defn -main
  [& args]
  (let [result (sumStuff 10 3)]
    (println result)))
