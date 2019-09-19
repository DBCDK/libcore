/*
 * Copyright Dansk Bibliotekscenter a/s. Licensed under GPLv3
 * See license text in LICENSE.txt or at https://opensource.dbc.dk/licenses/gpl-3.0/
 */

package dk.dbc.libcore;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class DBCTest {
    @Test
    void governs() {
        assertThat("Governed as int", DBC.governs(870970), is(true));
        assertThat("Governed as string", DBC.governs("870970"), is(true));
        assertThat("Not governed", DBC.governs(123456), is(false));
    }

    @Test
    void agency() {
        assertThat("toString()", "" + DBC.agency, is("191919"));
        assertThat("toInt()", DBC.agency.toInt(), is(191919));
    }
}