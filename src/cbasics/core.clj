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

(defn takeStuff
  []
  (take 3 [4 2 2 4 6]))

(defn takeSomeStuff
  [number]
  (some #(> number %) '(1 2 5)))

(defn sortStuff
  []
  (sort [3 2 1]))

(defn mapStuff
  []
  (map (fn [x] (* x x)) (range 50)))

(defn filterStuff
  []
  (filter (fn([x] (even? x))) (range 50)))

; entry function
(defn -main
  [& args]
  (let [result (mapStuff)]
    (println result)))

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
