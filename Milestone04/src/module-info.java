/**
 *
 */
/**
 *
 */
module Milestone04 {
    requires com.fasterxml.jackson.databind;
    requires transitive com.fasterxml.jackson.core;
    opens Store to com.fasterxml.jackson.databind;
}

