package Controller;

import org.apache.commons.io.FilenameUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UploadUtils {

	public static String processUpload(String fieldName, HttpServletRequest req, String storeFolder,
			String storeFilename) throws IOException, ServletException {

		Part filePart = req.getPart(fieldName);

		if (filePart == null || filePart.getSize() == 0) {

			return "";

		}

		if (storeFolder == null) {

			storeFolder = "F:\\IMG\\store\\store_default";

		}

		if (storeFilename == null) {

			storeFilename = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();

		} else {

			storeFilename += "."
					+ FilenameUtils.getExtension(Paths.get(filePart.getSubmittedFileName()).getFileName().toString());

		}

		Path uploadPath = Paths.get(storeFolder);

		if (!Files.exists(uploadPath)) {

			Files.createDirectories(uploadPath);

		}

		filePart.write(Paths.get(uploadPath.toString(), storeFilename).toString());

		return storeFilename;

	}

}