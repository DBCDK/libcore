/*
 * Copyright Dansk Bibliotekscenter a/s. Licensed under GPLv3
 * See license text in LICENSE.txt or at https://opensource.dbc.dk/licenses/gpl-3.0/
 */

package dk.dbc.libcore;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class DBC {
    /**
     * DBC agency ID
     */
    public static Agency agency = new Agency();

    private static final Set<String> PORTFOLIO = Stream.of(
            "870970",
            "870971",
            "870974",
            "870975",
            "870976",
            "870979",
            "190002",
            "190004",
            "190007"
    ).collect(Collectors.toSet());

    /**
     * @param agencyId agency ID to test for DBC governance
     * @return true if DBC governs the specified agency, false if not
     */
    public static boolean governs(String agencyId) {
        return PORTFOLIO.contains(agencyId);
    }

    /**
     * @param agencyId agency ID to test for DBC governance
     * @return true if DBC governs the specified agency, false if not
     */
    public static boolean governs(int agencyId) {
        return PORTFOLIO.contains(Integer.toString(agencyId));
    }

    private DBC() {}

    public static final class Agency {
        private Agency() {}

        public int toInt() {
            return 191919;
        }

        @Override
        public String toString() {
            return "191919";
        }
    }
}
