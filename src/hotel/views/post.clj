(ns hotel.views.post
	(:use [hiccup core page])
)

(comment
	define views
)

(defn index []
  (html5
    [:head
      [:title "nepleaks.org"]
    ]
    [:body
      [:h1 "welcome to nepleaks.org"]]))
