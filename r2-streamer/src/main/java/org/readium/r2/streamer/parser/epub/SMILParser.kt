/*
 * Module: r2-streamer-kotlin
 * Developers: Aferdita Muriqi, Clément Baumann
 *
 * Copyright (c) 2018. Readium Foundation. All rights reserved.
 * Use of this source code is governed by a BSD-style license which is detailed in the
 * LICENSE file present in the project repository where this source code is maintained.
 */

package org.readium.r2.streamer.parser.epub

import org.readium.r2.shared.parser.xml.Node

class SMILParser {

    fun parseAudio(audio: Node, href: String) : String {
        return audio.attributes["src"]+"#t="+audio.get("clipBegin")+","+audio.get("clipEnd");
    }
}