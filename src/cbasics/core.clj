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

(defn applyStuff
  []
  (apply + '(1 2)))

(defn takeStuff
  []
  (take 3 [4 2 2 4 6]))

(defn takeSomeStuff
  [number]
  (some #(> number %) '(1 2 5)))

(defn dropStuff
  []
  (drop 2 [0 1 2 3 4]))

(defn sortStuff
  []
  (sort [3 2 1]))

(defn mapStuff
  []
  (map (fn [x] (* x x)) (range 50))) ; returns a lazy sequence

(defn filterStuff
  []
  (filter (fn([x] (even? x))) (range 50)))

(defn reduceStuff
  []
  (reduce * (range 1 10))) ; applying the function + to each element

(defn compStuff
  []
  ((comp (fn([x] (conj [] x))) +) 1 10))

(def meaningOfLife (partial + 41)) ; #nemli

(defmacro if-sqn [pred foo-expr bar-expr]
  `(if (not ~pred) ~foo-expr ~bar-expr)) ; (macroexpand '(if-sqn false (println "Meu objetivo é a CONQUISTAAAA!!!") (println "Parece que piorou"))))

; entry function
(defn -main
  [& args]
  ; (let [result (applyStuff)]
  ;   (println result)))
  (if-sqn false (println "Meu objetivo é a CONQUISTAAAA!!!") (println "Parece que piorou")))

; TODO delay 

; TODO promise 

; TODO future 

; TODO atoms (maybe)
