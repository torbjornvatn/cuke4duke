(defn stepdef [regexp, closure]
  (. cuke4duke.internal.clj.CljLanguage (addCljStepDefinition regexp, closure)))

(defmacro Before [& forms]
  `(. cuke4duke.internal.clj.CljLanguage (addCljBeforeHook (fn [] ~@forms))))

(defmacro After [& forms]
  `(. cuke4duke.internal.clj.CljLanguage (addCljAfterHook (fn [] ~@forms))))

(def Given stepdef)
(def When stepdef)
(def Then stepdef)
