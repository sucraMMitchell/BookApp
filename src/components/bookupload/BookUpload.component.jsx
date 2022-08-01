import React from "react";
import axios from "axios";

const BookUpload = () => {
  const state = { selectedFile: null }

  const fileChangedHandler = event => {
    this.setState({ selectedFile: event.target.files[0] })
  }

  const uploadHandler = () => {
    const formData = new FormData()
    formData.append(
      'myFile',
      this.state.selectedFile,
      this.state.selectedFile.name
    )
    //axios.post('/book/upload', formData)
  }

  return (
    <div>
      <input type="file" onChange={fileChangedHandler}></input><br></br>
      <button onClick={uploadHandler}>Upload!</button>
    </div>
  );
};

export default BookUpload;
