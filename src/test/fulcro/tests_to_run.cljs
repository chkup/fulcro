(ns fulcro.tests-to-run
  (:require
    [clojure.spec.test.alpha :as st]
    fulcro.client.impl.application-spec
    fulcro.client.impl.data-targeting-spec
    fulcro.client.impl.parser-spec
    fulcro.client-spec
    fulcro.client.data-fetch-spec
    fulcro.logging-spec
    fulcro.client.mutations-spec
    fulcro.client.network-spec
    fulcro.client.primitives-spec
    fulcro.client.routing-spec
    fulcro.client.util-spec
    fulcro.history-spec
    fulcro.ui.form-state-spec
    fulcro.server-render-spec
    fulcro.i18n-spec
    fulcro.client.dom-spec
    fulcro.client.localized-dom-spec
    fulcro-css.css-spec))

;********************************************************************************
; IMPORTANT:
; For cljs tests to work in CI, we want to ensure the namespaces for all tests are included/required. By placing them
; here (and depending on them in user.cljs for dev), we ensure that the all-tests namespace (used by CI) loads
; everything as well.
;********************************************************************************

;(st/instrument)
