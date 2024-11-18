import React, { useEffect, useState } from "react";
import axios from "axios";

function App() {
  const [quote, setQuote] = useState("");

  useEffect(() => {
    // Fetch a random quote from the backend API
    axios.get("https://rhea-server-581626544249.asia-southeast1.run.app/api/quote")
      .then(response => {
        console.log(response.data);
        setQuote(response.data);
      })
      .catch(error => {
        console.error("There was an error fetching the quote!", error);
      });
  }, []);

  return (
    <div className="App">
      <h1>{quote}</h1>

      {/* Display image */}
      <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/d/d2/Fortune_cookies.jpg/640px-Fortune_cookies.jpg" alt="Random Image" width="300" />

      {/* Link to GitHub repository */}
      <a href="https://github.com/hungrhea/myrepo" target="_blank" rel="noopener noreferrer">Repository</a>
    </div>
  );
}

export default App;
