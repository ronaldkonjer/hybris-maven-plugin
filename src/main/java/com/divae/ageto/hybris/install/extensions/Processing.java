package com.divae.ageto.hybris.install.extensions;

import com.divae.ageto.hybris.install.extensions.binary.ExtensionBinary;
import com.divae.ageto.hybris.install.extensions.binary.JARArchive;

import java.io.File;

/**
 * Created by mhaagen on 10.08.2016.
 */
public class Processing implements Extension {
    @Override
    public File getExtensionBaseDirectory() {
        return new File("ext/processing");
    }

    @Override
    public String getExtensionName() {
        return "processing";
    }

    @Override
    public ExtensionBinary getExtensionBinary() {
        return new JARArchive(new File("processingserver.jar"));
    }
}