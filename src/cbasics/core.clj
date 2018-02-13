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

; get by index
(defn getStuffByIndex
  []
  (nth [1, 2, 3] 1))

; create a hash
(defn createHash
  []
  (hash-map :foo "bar" :bar "foo")) ; or simply {:foo "bar" :foo "bar"}

; get by value
(defn getStuffByKey
  []
  (get {:a 10 :foo "daiego" :c 20} :foo))

(defn ifStuff
  [age]
  (if (> age 80)
   (println "You're going to die soon...")
   (println "Don't worry, you'll eventually die as well :)")))

(defn loopStuff
  []
  (for [x  (range 1 10)]
    (* x x)))

; entry function
(defn -main
  [& args]
  (let [result (loopStuff)]
    (println result)))

; TODO take

; TODO some

; TODO sort

; TODO filter

; TODO map

; TODO reduce

; TODO drop

; TODO partial application

; TODO lazy sequences

; TODO sequeable abstraction

; TODO apply

; TODO conj 

; TODO into

; TODO macro sample

; TODO delay 

; TODO promise 

; TODO future 

; TODO atoms (maybe)
