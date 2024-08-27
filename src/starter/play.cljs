(ns starter.play
  (:require [quil.core :as q]))

(defn play []
  (q/background 240)

  (q/fill 10 255 255)
  (q/ellipse 100 100 100 100)

  (q/line 100 100 500 300)
  (q/line 100 100 200 200)

  (q/fill 200 100 100)
  (q/ellipse 300 100 100 100))
