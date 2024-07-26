function addMember() {
    const username = document.getElementById('username').value;
    if (username.trim() === '') {
        alert('Username cannot be empty');
        return;
    }

    // Here you will add the code to send a request to the server to add a new member
    // and then refresh the members list
    console.log('Adding member:', username);
}

function deleteMember(memberId) {
    // Here you will add the code to send a request to the server to delete the member
    // and then refresh the members list
    console.log('Deleting member with ID:', memberId);
}

// This function should be called to refresh the members list from the server
function refreshMembersList() {
    // Here you will add the code to fetch the members list from the server
    // and update the HTML to display it
    console.log('Refreshing members list');
}

// Call this function when the page loads to populate the members list
document.addEventListener('DOMContentLoaded', refreshMembersList);
